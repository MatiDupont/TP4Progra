package Ejercicio7;

public class Violin extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Hola soy un Violin");
        System.out.println("Soy un Instrumento a " + getTipo());
        System.out.println("Me puedes tocar con un arco");
    }

    // vemos también la clase hija Violin que para este
    //ejemplo solo utilizaremos (mediante la herencia) las propiedades de la clase padre.
    public Violin(String tipo) {
        super(tipo);
    }
}
