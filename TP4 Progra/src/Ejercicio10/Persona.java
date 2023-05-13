package Ejercicio10;

public class Persona implements PuedeCantar{
    // Crear la clase Persona que implemente el interfaz PuedeCantar y que cuando cante lo haga con las
    //notas musicales.
    @Override
    public void cantar() {
        System.out.println("Do Re Mi Fa Sol La Si");
    }
}
