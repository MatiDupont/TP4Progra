package Ejercicio8;

import java.util.List;
import java.util.Random;

public class PersonalServicio extends Empleado{
    // Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato,
    //secretaría, ...).
    private Seccion seccion;

    public PersonalServicio(String nombre, String apellido, int DNI, EstadoCivil estado, int añoIncorporacion, Seccion seccion) {
        super(nombre, apellido, DNI, estado, añoIncorporacion);
        this.seccion = seccion;
    }

    // Traslado de sección de un empleado del personal de servicio

    public void trasladoDeSeccion(Seccion nuevaSeccion){
        if (this.seccion != nuevaSeccion){
            System.out.println("El traslado a la seccion " + nuevaSeccion + " fue satisfactorio");
            this.seccion = nuevaSeccion;
        }
        else {
            System.out.println("No es posible hacer el traslado a " + nuevaSeccion + " ya que ya se encuentra en esa seccion");
        }
    }
    List<Integer> numerosDespachoActuales = super.getNumeroDespacho();
    int numeroDespachoAAsignar;
    @Override
    public void setNumeroDespacho(int nuevoNumeroDespacho) {
        if (!numerosDespachoActuales.contains(nuevoNumeroDespacho)) {
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
            System.out.println("A continuacion se te asignara uno automaticamente...");
            int numDespachoAleatorio = generarNumeroDespachoAleatorio();
            numerosDespachoActuales.add(numDespachoAleatorio);
            numeroDespachoAAsignar = numDespachoAleatorio;
        }
    }
    Random random = new Random();
    private int generarNumeroDespachoAleatorio(){
        return random.nextInt(1000) + 1;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "PersonalServicio{" +
                "nombre=" + getNombre() + ", " +
                "apellido=" + getApellido() + ", " +
                "DNI=" + getDNI() + ", " +
                "estadoCivil=" + getEstado() + ", " +
                "añoDeIncorporacion=" + getAñoIncorporacion() + ", " +
                "numeroDeDespacho=" + numeroDespachoAAsignar + ", " +
                "seccion=" + seccion +
                '}' + '}';
    }
}
