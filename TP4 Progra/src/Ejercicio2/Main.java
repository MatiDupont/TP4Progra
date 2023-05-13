package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cree un programa que haga lo siguiente:
        //▪ Crea un array de Passwords con el tamaño que tu le indiques por teclado.
        //▪ Crea un bucle que cree un objeto para cada posición del array.
        //▪ Indica también por teclado la longitud de los Passwords (antes de bucle).
        //▪ Crea otro array de booleanos donde se almacene si el password del array de Password es o no
        //fuerte (usa el bucle anterior).
        //▪ Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).
        // Usa este simple formato:
        //contraseña1 valor_booleano1
        //contraseña2 valor_bololeano2

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array que deseas crear: ");
        int tamaño = input.nextInt();

        Password[] passwords = new Password[tamaño];

        System.out.println("Ingrese la longitud de los passwords :");
        int longitud = input.nextInt();

        Boolean[] passwordEsFuerte = new Boolean[tamaño];

        for (int i = 0; i < passwords.length; i++){
            if (longitud < 8){
                passwords[i] = new Password();
            }else{
                passwords[i] = new Password(longitud);
            }
            passwordEsFuerte[i] = passwords[i].esFuerte();
            System.out.println(passwords[i].toString() + " " + passwordEsFuerte[i]);
        }
    }
}
