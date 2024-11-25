package co.edu.poli.Paradigmas.vista;

import co.edu.poli.Paradigmas.modelo.*;
import co.edu.poli.Paradigmas.servicios.*;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static Operacion operacion;
    private static Scanner scanner;

    public Principal() {
        operacion = new Operacion();
    }

    public static void main(String[] args) {
        operacion = new Operacion();
        scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            try {
                switch (opcion) {
                    case 1:
                        crearServicio();
                        break;
                    case 2:
                        mostrarServicios();
                        break;
                    case 3:
                        actualizarServicio();
                        break;
                    case 4:
                        eliminarServicio();
                        break;
                    case 5:
                        continuar = false;
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.err.println("Error en la operación: " + e.getMessage());
            }

            if (continuar) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE SERVICIOS ===");
        System.out.println("1. Crear nuevo servicio");
        System.out.println("2. Mostrar servicios");
        System.out.println("3. Actualizar servicio");
        System.out.println("4. Eliminar servicio");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearServicio() {
        System.out.println("\n=== CREAR NUEVO SERVICIO ===");
        System.out.println("Tipo de servicio:");
        System.out.println("1. Servicio Normal");
        System.out.println("2. Servicio Especial");
        System.out.print("Seleccione el tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID del servicio: ");
        String id = scanner.nextLine();

        System.out.print("Nombre del servicio: ");
        String nombre = scanner.nextLine();

        System.out.print("Costo (valor numérico): ");
        double costo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Moneda (ej: COP): ");
        String moneda = scanner.nextLine();

        System.out.print("Duración (número): ");
        String duracionValor = scanner.nextLine();

        System.out.print("Unidad de duración (min/h): ");
        String duracionUnidad = scanner.nextLine();

        CostoServicio costoServicio = new CostoServicio(moneda, costo);
        DuracionServicio duracionServicio = new DuracionServicio(duracionValor, duracionUnidad);

        Servicio servicio;
        if (tipo == 1) {
            System.out.print("Nivel (BASICO/PREMIUM): ");
            String nivel = scanner.nextLine();
            System.out.print("Descuento: ");
            double descuento = scanner.nextDouble();
            servicio = new ServicioNormal(id, nombre, nivel, costo, costoServicio, descuento);
        } else {
            servicio = new ServicioEspecial(id, nombre, costoServicio, costo);
        }

        servicio.setDuracion(duracionServicio);
        operacion.guardarServicio(servicio);
        System.out.println("Servicio creado exitosamente");
    }

    private static void mostrarServicios() {
        System.out.println("\n=== SERVICIOS REGISTRADOS ===");
        List<Servicio> servicios = operacion.obtenerServicios();
        if (servicios.isEmpty()) {
            System.out.println("No hay servicios registrados");
            return;
        }
        for (Servicio servicio : servicios) {
            System.out.println(servicio);
            System.out.println("----------------------------");
        }
    }

    private static void actualizarServicio() {
        System.out.println("\n=== ACTUALIZAR SERVICIO ===");
        System.out.print("Ingrese el ID del servicio a actualizar: ");
        String id = scanner.nextLine();

        Servicio servicioExistente = operacion.buscarServicioPorId(id);
        if (servicioExistente == null) {
            System.out.println("No se encontró el servicio con ID: " + id);
            return;
        }

        System.out.println("Ingrese los nuevos datos:");
        System.out.print("Nuevo nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Nuevo costo: ");
        double costo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nueva moneda: ");
        String moneda = scanner.nextLine();

        System.out.print("Nueva duración (número): ");
        String duracionValor = scanner.nextLine();

        System.out.print("Nueva unidad de duración (min/h): ");
        String duracionUnidad = scanner.nextLine();

        CostoServicio costoServicio = new CostoServicio(moneda, costo);
        DuracionServicio duracionServicio = new DuracionServicio(duracionValor, duracionUnidad);

        Servicio servicioActualizado;
        if (servicioExistente instanceof ServicioNormal) {
            System.out.print("Nivel (BASICO/PREMIUM): ");
            String nivel = scanner.nextLine();
            System.out.print("Descuento: ");
            double descuento = scanner.nextDouble();
            servicioActualizado = new ServicioNormal(id, nombre, nivel, costo, costoServicio, descuento);
        } else {
            servicioActualizado = new ServicioEspecial(id, nombre, costoServicio, costo);
        }

        servicioActualizado.setDuracion(duracionServicio);
        operacion.actualizarServicio(id, servicioActualizado);
        System.out.println("Servicio actualizado exitosamente");
    }

    private static void eliminarServicio() {
        System.out.println("\n=== ELIMINAR SERVICIO ===");
        System.out.print("Ingrese el ID del servicio a eliminar: ");
        String id = scanner.nextLine();

        Servicio servicioExistente = operacion.buscarServicioPorId(id);
        if (servicioExistente == null) {
            System.out.println("No se encontró el servicio con ID: " + id);
            return;
        }

        operacion.eliminarServicio(id);
        System.out.println("Servicio eliminado exitosamente");
    }
}