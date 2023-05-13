package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        // Cree un programa que haga lo siguiente:
        //▪ Pide por teclado el nombre, la edad, sexo, peso y altura.
        //▪ Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por
        //teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por
        //defecto, para este último utiliza los métodos set para darle a los atributos un valor.
        //▪ Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su
        //peso ideal con un mensaje.
        //▪ Indicar para cada objeto si es mayor de edad.
        //▪ Por último, mostrar la información de cada objeto.

        Scanner input = new Scanner(System.in);

        System.out.println("Datos de la primera persona:");
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = input.nextInt();
        System.out.println("Sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("Ingrese el peso corporal: ");
        double peso = input.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = input.nextDouble();
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        input.nextLine();

        System.out.println();
        System.out.println("Datos de la segunda persona:");
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = input.nextInt();
        System.out.println("Sexo: ");
        sexo = input.next().charAt(0);
        Persona p2 = new Persona(nombre, edad, sexo);
        input.nextLine();

        System.out.println();
        Persona p3 = new Persona();
        p3.setNombre("Matias");
        p3.setEdad(21);
        p3.setSexo('H');
        p3.setPeso(72.4);
        p3.setAltura(1.73);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        for (Persona persona : personas){
            if (persona.calcularIMC() == -1){
                System.out.println(persona.getNombre() + " esta por debajo de su peso ideal");
            } else if (persona.calcularIMC() == 0) {
                System.out.println(persona.getNombre() + " esta en su peso ideal");
            } else if (persona.calcularIMC() == 1) {
                System.out.println(persona.getNombre() + " tiene sobrepeso");
            } else {
                System.out.println("No fue posible calcular el IMC de " + persona.getNombre());
            }

            if (persona.esMayorDeEdad()){
                System.out.println(persona.getNombre() + " es mayor de edad");
            }
            else {
                System.out.println(persona.getNombre() + " no es mayor de edad");
            }

            System.out.println(persona);
            System.out.println();
        }
    }
}