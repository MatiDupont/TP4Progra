package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cuenta> clientes = new ArrayList<>();

        Cuenta c1 = new Cuenta("Matias Dupont");
        Cuenta c2 = new Cuenta("Matias Dupont", 37999);

        clientes.add(c1);
        clientes.add(c2);

        c1.setCantidad(25000);
        c1.setTitular("Cristiano Ronaldo");
        c1.ingresar(400777.7);
        System.out.println("La cantidad hasta el momento de " + c1.getTitular() + " luego del ingreso del dinero es: " + c1.getCantidad());
        c1.retirar(88131.009);
        System.out.println("La cantidad hasta el momento de " + c1.getTitular() + " luego del retiro del dinero es: " + c1.getCantidad());

        System.out.println(c1);

        c2.retirar(38000);
        System.out.println("La cantidad hasta el momento de " + c2.getTitular() + " luego del retiro del dinero es: " + c2.getCantidad());
        c2.ingresar(5656.56);
        System.out.println("La cantidad hasta el momento de " + c2.getTitular() + " luego del ingreso del dinero es: " + c2.getTitular());

        System.out.println(c2);
    }
}
