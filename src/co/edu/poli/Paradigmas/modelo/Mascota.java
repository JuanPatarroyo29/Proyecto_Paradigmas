package co.edu.poli.Paradigmas.modelo;


/**
 * 
 */
public class Mascota {

    private String nombre;
    private String especie;
    private String edad;
    private double peso;
    private String color;
    private boolean alergico;
    private boolean servicioEspecial;


    public Mascota(String nombre, String especie, String edad, double peso, String color, boolean alergico, boolean servicioEspecial) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
    this.peso = peso;
    this.color = color;
    this.alergico = alergico;
    this.servicioEspecial = servicioEspecial;
    }



    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public String getEdad() {return edad;}
    public void setEdad(String edad) {this.edad = edad;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public boolean getAlergico() {return alergico;}
    public void setAlergico(boolean alergico) {this.alergico = alergico;}

    public boolean isServicioEspecial() {return servicioEspecial;}
    public void setServicioEspecial(boolean servicioEspecial) {this.servicioEspecial = servicioEspecial;}


    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", peso=" + peso + ", color="
                + color + ", alergico=" + alergico + ", servicioEspecial=" + servicioEspecial + "]";
    }








    /**
     * 
     */
    public void recibirServicio() {
        // TODO implement here
    }

    /**
     * 
     */
    public void mostrarSintomas() {
        // TODO implement here
    }

}