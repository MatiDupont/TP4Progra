package Ejercicio14;

import Ejercicio13.JuegoDeDados;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero jan = new JuegoAdivinaNumero();

        jan.iniciar();
        System.out.println();
        jan.jugar();
        System.out.println();
        jan.finalizar();
    }
}
