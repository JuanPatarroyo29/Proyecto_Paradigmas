package co.edu.poli.Paradigmas.modelo;

/**
 * 
 */
public class Turno {
    private int id;
    private String fecha;
    private String horaTurno;
    private Cliente cliente;
    private Mascota mascota;
    private Servicio servicio;
    private boolean estado;
    

    public Turno(int id, String fecha, String horaTurno, Cliente cliente, Mascota mascota, Servicio servicio, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.horaTurno = horaTurno;
        this.cliente = cliente;
        this.mascota = mascota;
        this.servicio = servicio;
        this.estado = estado;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getHoraTurno() {return horaTurno;}
    public void setHoraTurno(String horaTurno) {this.horaTurno = horaTurno;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Mascota getMascota() {return mascota;}
    public void setMascota(Mascota mascota) {this.mascota = mascota;}

    public Servicio getServicio() {return servicio;}
    public void setServicio(Servicio servicio) {this.servicio = servicio;}

    public boolean isEstado() {return estado;}
    public void setEstado(boolean estado) {this.estado = estado;}








    public void asignarServicio() {
        // TODO implement here
    }

    /**
     * 
     */
    public void confirmarTurno() {
        // TODO implement here
    }

    /**
     * 
     */
    public void reagendar() {
        // TODO implement here
    }

}