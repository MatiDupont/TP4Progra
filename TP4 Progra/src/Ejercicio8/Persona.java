package Ejercicio8;

public abstract class Persona {
    // Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y
    //su estado civil.
    private String nombre;
    private String apellido;
    private int DNI;
    private EstadoCivil estado;

    public Persona(String nombre, String apellido, int DNI, EstadoCivil estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado = estado;
    }

    // Cambio del estado civil de una persona.
    public void setEstadoCivil(EstadoCivil nuevoEstado){
        if (this.estado != nuevoEstado) {
            System.out.println("Estado civil modificado con exito!");
            this.estado = nuevoEstado;
        }
        else {
            System.out.println("No puedo modificar ya que ese ya es tu estado actual!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public EstadoCivil getEstado() {
        return estado;
    }
}
