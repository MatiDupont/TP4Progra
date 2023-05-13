package Ejercicio8;

import java.util.List;

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
                "numeroDeDespacho=" + getNumeroDespacho() + ", " +
                "departamento=" + departamento +
                '}' + '}';
    }

    @Override
    public void setNumeroDespacho(int nuevoNumeroDespacho) {
        List<Integer> numerosDespachoActuales = super.getNumeroDespacho();
        if (!numerosDespachoActuales.contains(nuevoNumeroDespacho)) {
            System.out.println("Numero de despacho reasignado con exito!");
            numerosDespachoActuales.add(nuevoNumeroDespacho);
        }
        else {
            System.out.println("No fue posible reasignar al empleado con ese numero dado que de momento se encuentra utilizado");
        }
    }
}
