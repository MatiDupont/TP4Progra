package Ejercicio9;

public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Abra", "amarillo");

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Color: " + p1.getColor());
        System.out.println("Potencia: " + p1.getPotenciaDeAtaque());
        System.out.println(p1.saludar());
        System.out.println("Nivel de vida: " + p1.getNivelDeVida());
        p1.setNivelDeVida(77);
        System.out.println("Nivel de vida luego del set: " + p1.getNivelDeVida());
        p1.sanar();
        System.out.println("Nivel de vida luego de ser sanado: " + p1.getNivelDeVida());
        p1.sanar();

        System.out.println();
        p1.evolucionar();
        System.out.println("Nuevo nombre luego de la evolucion: " + p1.getNombre());
        System.out.println("Nuevo color luego de la evolucion: " + p1.getColor());
        System.out.println("Nueva potencia luego de la evolucion: " + p1.getPotenciaDeAtaque());
        System.out.println(p1.saludar());

        System.out.println();
        p1.evolucionar();
        System.out.println("Nuevo nombre luego de la evolucion: " + p1.getNombre());
        System.out.println("Nuevo color luego de la evolucion: " + p1.getColor());
        System.out.println("Nueva potencia luego de la evolucion: " + p1.getPotenciaDeAtaque());
        System.out.println(p1.saludar());
    }
}
