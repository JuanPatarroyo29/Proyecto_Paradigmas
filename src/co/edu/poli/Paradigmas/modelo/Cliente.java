package co.edu.poli.Paradigmas.modelo;

public class Cliente {

    private String nombre;

    private String direccion;

    private String telefono;

    private String listaMascotas;

    private Mascota[ ] mascota;

    public Cliente(String nombre, String direccion, String telefono, String listaMascotas, Mascota[ ] mascota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getListaMascotas() {return listaMascotas;}
    public void setListaMascotas(String listaMascotas) {this.listaMascotas = listaMascotas;}

    public Mascota[] getMascota() {return mascota;}
    public void setMascota(Mascota[] mascota) {this.mascota = mascota;}


    public void prepararMascota() {
        // TODO implement here
    }

    /**
     * 
     */
    public void seleccionaTurno() {
        // TODO implement here
    }

}