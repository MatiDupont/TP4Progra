package Ejercicio8;

import java.util.List;
import java.util.Random;

public class Profesor extends Empleado{
    // Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen
    //(lenguajes, matemáticas, arquitectura, ...).
    private Departamento departamento;

    public Profesor(String nombre, String apellido, int DNI, EstadoCivil estado, int añoIncorporacion, Departamento departamento) {
        super(nombre, apellido, DNI, estado, añoIncorporacion);
        this.departamento = departamento;
    }

    // Cambio de departamento de un profesor.

    public void setDepartamento(Departamento nuevoDepartamento) {
        if (this.departamento != nuevoDepartamento){
            System.out.println("El cambio al departamento " + nuevoDepartamento + " fue realizado con exito!");
            this.departamento = nuevoDepartamento;
        }
        else {
            System.out.println("No puedo realizar el cambio al departamento " + nuevoDepartamento + " ya que ese ya es su departamento actual!");
        }
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Profesor{" +
                "nombre=" + getNombre() + ", " +
                "apellido=" + getApellido() + ", " +
                "DNI=" + getDNI() + ", " +
                "estadoCivil=" + getEstado() + ", " +
                "añoDeIncorporacion=" + getAñoIncorporacion() + ", " +
                "numeroDeDespacho=" + numeroDespachoAAsignar + ", " +
                "departamento=" + departamento +
                '}' + '}';
    }

    List<Integer> numerosDespachoActuales = super.getNumeroDespacho();
    int numeroDespachoAAsignar;
    @Override
    public void setNumeroDespacho(int nuevoNumeroDespacho) {
        if (!numerosDespachoActuales.contains(nuevoNumeroDespacho)){
            System.out.println("Numero de despacho reasignado con exito!");
            if (numerosDespachoActuales.size() > 0) {
                int valorAnterior = numerosDespachoActuales.get(numerosDespachoActuales.size() - 1);
                numerosDespachoActuales.remove(numerosDespachoActuales.size() - 1);
                System.out.println("Valor anterior (" + valorAnterior + ") eliminado de la lista");
            }
            numerosDespachoActuales.add(nuevoNumeroDespacho);
            numeroDespachoAAsignar = nuevoNumeroDespacho;
        }
        else {
            System.out.println("No fue posible reasignar al empleado con ese numero dado que de momento se encuentra utilizado");
            System.out.println("A continuacion se te asignara uno automaticamente");
            int numDespachoAleatorio = generarNumeroDespachoAleatorio();
            numerosDespachoActuales.add(numDespachoAleatorio);
            numeroDespachoAAsignar = numDespachoAleatorio;
        }
    }
    Random random = new Random();
    private int generarNumeroDespachoAleatorio(){
        return random.nextInt(1000) + 1;
    }
}
