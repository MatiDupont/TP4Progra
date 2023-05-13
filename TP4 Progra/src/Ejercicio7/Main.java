package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Guitarra g = new Guitarra("Cuerda");
        Saxofon s = new Saxofon("Viento");
        Violin v = new Violin("Cuerda");

        g.tocar();
        System.out.println();
        s.tocar();
        System.out.println();
        v.tocar();
    }
}
