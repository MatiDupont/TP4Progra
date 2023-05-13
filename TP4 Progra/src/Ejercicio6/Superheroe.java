package Ejercicio6;

// Crear la clase Superheroe, que herede de Persona
public class Superheroe extends Persona{
    // Cada Superheroe debe tener sus atributos: nombFicticio, tipoPoder.
    private String nombFicticio;
    private String tipoPoder;

    public Superheroe(String nombre, double altura, String nombFicticio, String tipoPoder) {
        super(nombre, altura);
        this.nombFicticio = nombFicticio;
        this.tipoPoder = tipoPoder;
    }

    // Se debe mostrar por pantalla el nombre real, ficticio, altura y tipo de poder

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombreReal='" + getNombre() + '\'' +
                ", nombFicticio='" + nombFicticio + '\'' +
                ", altura='" + getAltura() + '\'' +
                ", tipoPoder='" + tipoPoder + '\'' +
                '}';
    }
}
