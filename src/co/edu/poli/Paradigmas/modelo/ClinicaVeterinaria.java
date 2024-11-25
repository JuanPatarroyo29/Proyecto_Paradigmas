package co.edu.poli.Paradigmas.modelo;

public class ClinicaVeterinaria {
    private String nombre;
    private String direccion;
    private String listaTurnos;
    private Servicio[ ] listaServicios;
    private Cliente[ ] cliente;


    public ClinicaVeterinaria(String nombre, String direccion, String listaTurnos, Servicio[ ] listaServicios, Cliente[ ] cliente) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.listaTurnos = listaTurnos;
    }


    




    public boolean verificarDisponibilidad() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean verificarCapacidad() {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void coordinarServicios() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String ajustarHorario() {
        // TODO implement here
        return "";
    }

    /**
     * @param turno 
     * @return
     */
    public boolean agendarTurno(Turno turno) {
        // TODO implement here
        return false;
    }

    /**
     * @param servicio 
     * @return
     */
    public boolean agregarServicios(Servicio servicio) {
        // TODO implement here
        return false;
    }

}