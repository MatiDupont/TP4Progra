package Ejercicio5;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;

    public Persona(String nombre, int edad, String DNI, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
}
