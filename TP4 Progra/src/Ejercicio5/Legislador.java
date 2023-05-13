package Ejercicio5;

public abstract class Legislador extends Persona {
    // Declara una clase abstracta Legislador que herede de la clase Persona, con un atributo
    // provinciaQueRepresenta (tipo String) y otros atributos.

    private String provinciaQueRepresenta;
    private String partidoPoliticoQueRepresenta;
    private int añosDeExperienciaPolitica;
    private int cantProyectosEntregados;
    private double salario;
    private String fechaInicioMandato;
    private String contacto;

    public Legislador(String nombre, int edad, String DNI, char sexo, String provinciaQueRepresenta, String partidoPoliticoQueRepresenta, int añosDeExperienciaPolitica, int cantProyectosEntregados, double salario, String fechaInicioMandato, String contacto) {
        super(nombre, edad, DNI, sexo);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPoliticoQueRepresenta = partidoPoliticoQueRepresenta;
        this.añosDeExperienciaPolitica = añosDeExperienciaPolitica;
        this.cantProyectosEntregados = cantProyectosEntregados;
        this.salario = salario;
        this.fechaInicioMandato = fechaInicioMandato;
        this.contacto = contacto;
    }

    // Declara un método abstracto getCamaraEnQueTrabaja().
    public abstract Camara getCamaraEnQueTrabaja();


}
