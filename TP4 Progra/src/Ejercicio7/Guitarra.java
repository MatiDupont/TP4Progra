package Ejercicio7;

public class Guitarra extends Instrumento{
    // vemos también la clase hija Guitarra que para este
    //ejemplo solo utilizaremos (mediante la herencia) las propiedades de la clase padre.

    @Override
    public void tocar() {
        System.out.println("Hola soy una Guitarra");
        System.out.println("Soy un instrumento a " + getTipo());
        System.out.println("Me puedes tocar con las manos");
    }

    public Guitarra(String tipo) {
        super(tipo);
    }


}
