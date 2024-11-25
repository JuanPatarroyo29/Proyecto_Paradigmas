package co.edu.poli.Paradigmas.servicios;

import co.edu.poli.Paradigmas.modelo.*;
import java.io.*;
import java.util.*;

public class ImplementarOperacion {
    
    private Operacion operacion;
    
    public ImplementarOperacion() {
        this.operacion = new Operacion();
    }
    
    public void ejemploUso() {
        try {
            // Crear servicios de ejemplo
            CostoServicio costoNormal = new CostoServicio("COP", 20.0);
            DuracionServicio hora = new DuracionServicio("2", "h");
            
            ServicioNormal servicio1 = new ServicioNormal("SN1", "Consulta B", "BASICO", 
                20.0, costoNormal, 0.0);
            servicio1.setDuracion(hora);
            
            // Crear
            operacion.guardarServicio(servicio1);
            System.out.println("Servicio guardado exitosamente");
            
            // Leer
            List<String> servicios = operacion.leerServicios();
            System.out.println("\nServicios guardados:");
            for (String servicio : servicios) {
                System.out.println(servicio);
            }
            
            // Actualizar
            ServicioNormal servicioActualizado = new ServicioNormal("SN1", "Consulta Modificada", 
                "BASICO", 25.0, costoNormal, 0.0);
            servicioActualizado.setDuracion(hora);
            operacion.actualizarServicio("SN1", servicioActualizado);
            System.out.println("\nServicio actualizado exitosamente");
            
            // Eliminar
            operacion.eliminarServicio("SN1");
            System.out.println("\nServicio eliminado exitosamente");
            
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ImplementarOperacion impl = new ImplementarOperacion();
        impl.ejemploUso();
    }
}