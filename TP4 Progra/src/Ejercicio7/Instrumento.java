package Ejercicio7;

public abstract class Instrumento {
    // En el diagrama vemos una clase Abstracta Instrumento, la cual posee una propiedad tipo y un
    // método abstracto tocar()
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    // Todos los instrumentos musicales se pueden tocar, por ello creamos este método abstracto, ya que
    //es un proceso común en todos los instrumentos sin importar el detalle de cómo se tocan, pues
    //sabemos que una guitarra no se toca de la misma manera que el saxofón, así al heredar de la clase
    //Instrumento, todas sus clases hijas están obligadas a implementar este método y darle la
    //funcionalidad que le corresponda...
    public abstract void tocar();

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }
}
