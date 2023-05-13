package Ejercicio6;

public class Persona {
    // Crear una clase Persona, que contenga el atributo: nombre, altura.

    private String nombre;
    private double altura;

    public Persona(String nombre, double altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }
}
