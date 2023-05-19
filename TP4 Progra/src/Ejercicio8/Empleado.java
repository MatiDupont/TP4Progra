package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Empleado extends Persona{
    // Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la
    //facultad y qué número de despacho tienen asignado
    private int añoIncorporacion;
    private static List<Integer> numeroDespacho = new ArrayList<>();

    public Empleado(String nombre, String apellido, int DNI, EstadoCivil estado, int añoIncorporacion) {
        super(nombre, apellido, DNI, estado);
        this.añoIncorporacion = añoIncorporacion;
    }

    // Reasignación de despacho a un empleado.

    public abstract void setNumeroDespacho(int nuevoNumeroDespacho);

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public List<Integer> getNumeroDespacho() {
        return numeroDespacho;
    }
}
