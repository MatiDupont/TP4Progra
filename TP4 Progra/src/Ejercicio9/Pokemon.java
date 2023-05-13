package Ejercicio9;

import java.util.Scanner;

public class Pokemon {
    private String nombre;
    private String color;
    private int potenciaDeAtaque;
    private int nivelDeVida;

    public Pokemon() {
    }

    public Pokemon(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.potenciaDeAtaque = 50;
        this.nivelDeVida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotenciaDeAtaque() {
        return potenciaDeAtaque;
    }

    public void setPotenciaDeAtaque(int potenciaDeAtaque) {
        this.potenciaDeAtaque = potenciaDeAtaque;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public String saludar(){
        return "Hola mi nombre es: " + getNombre();
    }

    public void sanar(){
        if (getNivelDeVida() < 100){
            this.nivelDeVida = 100;
        }
        else{
            System.out.println("Su pokemon tiene nivel de vida completo");
        }
    }

    Scanner input = new Scanner(System.in);
    public void evolucionar(){
        System.out.println("Ingrese el nuevo nombre: ");
        String nuevoNombre = input.nextLine();
        setNombre(nuevoNombre);
        System.out.println("Ingrese el nuevo color: ");
        String nuevoColor = input.next();
        input.nextLine();
        setColor(nuevoColor);
        setPotenciaDeAtaque(this.potenciaDeAtaque + (this.potenciaDeAtaque * 20) / 100);
    }
}
