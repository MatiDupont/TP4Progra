package Ejercicio13;

import java.util.Random;
import java.util.Scanner;

// se desea implementar una clase JuegoDeDados
public class JuegoDeDados implements Juego{
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    // iniciar() pedirá el nombre de 2 jugadores
    private static String nombreJug1;
    private static String nombreJug2;
    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del primer jugador: ");
        nombreJug1 = input.nextLine();
        System.out.println("Ingrese el nombre del segundo jugador: ");
        nombreJug2 = input.nextLine();
    }

    // jugar() tendrá 2 dados que se lanzan al azar y devuelven un número random, el dado1 pertenecerá al jugador1 y el dado2, al jugador2,
    private static int dado1;
    private static int dado2;
    @Override
    public void jugar() {
        lanzamientoDados();
        System.out.println("El jugador " + nombreJug1 + " saco un " + dado1);
        System.out.println("El jugador " + nombreJug2 + " saco un " + dado2);
    }

    // finalizar() imprime por pantalla el dado que haya salido con mayor valor y el nombre del ganador.
    @Override
    public void finalizar() {
        if (dado1 > dado2){
            System.out.println("El dado de " + nombreJug1 + " fue mayor (" + dado1 + "). " + nombreJug1 + " fue el ganador");
        } else if (dado2 > dado1) {
            System.out.println("El dado de " + nombreJug2 + " fue mayor (" + dado2 + "). " + nombreJug2 + " fue el ganador");
        }
        else {
            System.out.println("Hubo empate!!!");
        }
    }

    private void lanzamientoDados(){
        System.out.println("Lanzando dados...");
        dado1 = random.nextInt(5) + 1;
        dado2 = random.nextInt(5) + 1;
    }
}
