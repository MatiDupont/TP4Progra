package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crea una lista de legisladores y muestra por pantalla la cámara en que trabajan haciendo uso del
        //polimorfismo.

        List<Legislador> legisladores = new ArrayList<>();

        Senador s1 = new Senador("Matias Dupont", 21, "44242242", 'M', "Buenos Aires", "Partido del Buen Codigo", 3, 20, 3500, "03/02/2020", "matiasn.dupont@gmail.com");
        Diputado d1 = new Diputado("Lucas Dalto", 20, "45153987", 'H', "Cordoba", "Partido del Buen Codigo", 6, 34, 7000, "18/07/2017", "soylucasdalto@gmail.com");
        Senador s2 = new Senador("Milva Gerpa", 22, "43300444", 'M', "Mendoza", "Partido del Buen Codigo", 2, 7, 750.8, "11/04/2021", "milvagerpa@gmail.com");
        Diputado d2 = new Diputado("Clara Gonzalez", 18, "46990490", 'M', "Corrientes", "Partido del Buen Codigo", 0, 0, 0, "12/05/2023", "matiasn.dupont@gmail.com");

        legisladores.add(s1);
        legisladores.add(d1);
        legisladores.add(s2);
        legisladores.add(d2);

        for (Legislador l : legisladores){
            System.out.println("Hola, soy " + l.getNombre() + " y trabajo en la camara de " + l.getCamaraEnQueTrabaja());
        }
    }
}
