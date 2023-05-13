package Ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {
    // Se desea manejar DOS listas de números enteros. La cantidad de elementos de la lista 1 DEBE ser un
    //número aleatorio entre 5 y 15. La cantidad de elementos de la lista 2 DEBE ser un numero aleatorio
    //entre 10 y 20.

    private List<Integer> lista1;
    private List<Integer> lista2;
    private List<Integer> lista3;
    private List<Integer> lista4;

    public Lista() {
        this.lista1 = new ArrayList<>();
        this.lista2 = new ArrayList<>();
        this.lista3 = new ArrayList<>();
        this.lista4 = new ArrayList<>();
    }

    Random random = new Random();

    private int longitudLista1 = random.nextInt(5, 16);
    private int longitudLista2 = random.nextInt(10, 21);

    // El rango de los números que serán agregados a la lista DEBE estar entre 50 y 550.

    private Integer rangoNumeros(){
        return random.nextInt(50, 551);
    }

    public void creacionLista1() {
        System.out.println("Longitud: " + longitudLista1);
        for (int i = 0; i < longitudLista1; i++){
            this.lista1.add(rangoNumeros());
        }
        System.out.println(lista1);
    }

    public void creacionLista2(){
        System.out.println("Longitud: " + longitudLista2);
        for (int i = 0; i < longitudLista2; i++){
            this.lista2.add(rangoNumeros());
        }
        System.out.println(lista2);
    }

    //Crear una tercera lista que contenga los elementos que están en la lista 1 y NO ESTAN en la lista 2
    public void creacionLista3(){
        lista1.removeAll(lista2);
        for (int i = 0; i < lista1.size(); i++){
            this.lista3.add(lista1.get(i));
        }
        System.out.println(lista3);
    }

    // Crear una cuarta lista que contenga los elementos de la lista 1 que son pares y los elementos de la
    //lista 2 que son impares

    public void creacionLista4(){
        for (int i = 0; i < lista1.size(); i++){
            if (lista1.get(i) % 2 == 0){
                this.lista4.add(lista1.get(i));
            }
        }
        for (int j = 0; j < lista2.size(); j++){
            if (lista2.get(j) % 2 != 0){
                this.lista4.add(lista2.get(j));
            }
        }
        System.out.println(lista4);
    }
}
