package Ejercicio14;

import Ejercicio13.Juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero implements Juego {
    // Implementar una clase llamada JuegoAdivinaNumero, tendrá atributos numAdivina, teclado e
    //intentos
    private int numAdivina;
    private Scanner teclado = new Scanner(System.in);
    private final int intentos = 3;

    // el método iniciar() generará y guardará un numero aleatorio
    Random random = new Random();
    private static int numAleatorio;
    @Override
    public void iniciar() {
        numAleatorio = random.nextInt(50) + 1;
        System.out.println(numAleatorio);
    }

    //  jugar() pedirá un numero por teclado, y en caso de no acertar, ira dando pistas indicando al
    //  usuario si el número a adivinar es menor o mayor al ingresado,
    private static int vidas = 3;
    @Override
    public void jugar() {
        for (int i = 0; i < intentos; i++){
            System.out.println("Ingrese un numero: ");
            numAdivina = teclado.nextInt();
            if (numAdivina == numAleatorio){
                System.out.println("Usted ha acertado, ganaste!!");
                break;
            } else if (numAdivina < numAleatorio) {
                System.out.println("El numero " + numAdivina + " no es correcto");
                System.out.println("El numero a adivinar es mayor...");
                vidas -= 1;
            } else {
                System.out.println("El numero " + numAdivina + " no es correcto");
                System.out.println("El numero a adivinar es menor...");
                vidas -=1;
            }
        }
    }

    // el método finalizar() dirá la cantidad de intentos que se hicieron hasta adivinar.
    @Override
    public void finalizar() {
        if (vidas == 0){
            System.out.println("Usted hizo uso de todos los intentos posibles y no logro acertar");
        } else if (intentos == vidas) {
            System.out.println("Usted hizo uso de un unico intento, la suerte esta de tu lado!");
        } else {
            System.out.println("Usted hizo uso de " + (intentos - vidas + 1)  + " intento/s");
        }

    }
}
