package co.edu.poli.Paradigmas.servicios;

import co.edu.poli.Paradigmas.modelo.Servicio;
import java.io.*;
import java.util.*;

public class Operacion {
    
    private static final String ARCHIVO_DATOS = "servicios_guardados.txt";
    private List<Servicio> servicios;
    
    public Operacion() {
        this.servicios = new ArrayList<>();
    }
    
    // Crear un nuevo servicio
    public void guardarServicio(Servicio servicio) {
        servicios.add(servicio);
        guardarEnArchivo();
    }
    
    // Leer todos los servicios
    public List<Servicio> obtenerServicios() {
        return servicios;
    }
    
    // Actualizar un servicio
    public void actualizarServicio(String id, Servicio servicioActualizado) {
        for (int i = 0; i < servicios.size(); i++) {
            if (servicios.get(i).getId().equals(id)) {
                servicios.set(i, servicioActualizado);
                guardarEnArchivo();
                return;
            }
        }
    }
    
    // Eliminar un servicio
    public void eliminarServicio(String id) {
        servicios.removeIf(s -> s.getId().equals(id));
        guardarEnArchivo();
    }
    
    // Buscar un servicio por ID
    public Servicio buscarServicioPorId(String id) {
        return servicios.stream()
                       .filter(s -> s.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }
    
    // Método privado para guardar en archivo
    private void guardarEnArchivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_DATOS))) {
            writer.println("=== REGISTRO DE SERVICIOS ===");
            writer.println("Fecha de actualización: " + new Date());
            writer.println("============================");
            writer.println();
            
            for (Servicio servicio : servicios) {
                writer.println("ID: " + servicio.getId());
                writer.println("Nombre: " + servicio.getNombre());
                writer.println("Duración: " + servicio.getDuracion());
                writer.println("Costo: " + servicio.getCostoServicio());
                writer.println("----------------------------");
            }
            
            System.out.println("Datos guardados en " + ARCHIVO_DATOS);
        } catch (IOException e) {
            System.err.println("Error al guardar en archivo: " + e.getMessage());
        }
    }
}