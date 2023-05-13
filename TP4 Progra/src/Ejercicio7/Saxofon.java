package Ejercicio7;

public class Saxofon extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Hola soy un Saxofon");
        System.out.println("Soy un Instrumento a " + getTipo());
        System.out.println("Me puedes tocar con la boca");
    }

    // vemos también la clase hija Saxofon que para este
    //ejemplo solo utilizaremos (mediante la herencia) las propiedades de la clase padre.
    public Saxofon(String tipo) {
        super(tipo);
    }
}
