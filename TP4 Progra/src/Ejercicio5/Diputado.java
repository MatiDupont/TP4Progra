package Ejercicio5;

public class Diputado extends Legislador{

    public Diputado(String nombre, int edad, String DNI, char sexo, String provinciaQueRepresenta, String partidoPoliticoQueRepresenta, int añosDeExperienciaPolitica, int cantProyectosEntregados, double salario, String fechaInicioMandato, String contacto) {
        super(nombre, edad, DNI, sexo, provinciaQueRepresenta, partidoPoliticoQueRepresenta, añosDeExperienciaPolitica, cantProyectosEntregados, salario, fechaInicioMandato, contacto);
    }

    @Override
    public Camara getCamaraEnQueTrabaja() {
        return Camara.DIPUTADOS;
    }
}
