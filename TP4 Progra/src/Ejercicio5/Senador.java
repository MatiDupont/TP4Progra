package Ejercicio5;

public class Senador extends Legislador{
    // Crea una clase concreta que herede de Legislador: la clase Senador que sobreescriban los métodos abstractos necesarios.
    public Senador(String nombre, int edad, String DNI, char sexo, String provinciaQueRepresenta, String partidoPoliticoQueRepresenta, int añosDeExperienciaPolitica, int cantProyectosEntregados, double salario, String fechaInicioMandato, String contacto) {
        super(nombre, edad, DNI, sexo, provinciaQueRepresenta, partidoPoliticoQueRepresenta, añosDeExperienciaPolitica, cantProyectosEntregados, salario, fechaInicioMandato, contacto);
    }

    @Override
    public Camara getCamaraEnQueTrabaja() {
        return Camara.SENADORES;
    }
}
