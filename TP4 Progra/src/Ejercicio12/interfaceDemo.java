package Ejercicio12;

public class interfaceDemo {
    public static void main(String[] args) {
        // Crea una clase concreta llamada interfaceDemo,
        // Utilice polimorfismo en el método main() de interfaceDemo para crear objetos Bike (de tipo Bicicleta) y
        //Bus(de tipo Autobús) y acceder a sus métodos start() y stop().

        Bicicleta bike = new Bicicleta();
        Autobus bus = new Autobus();

        bike.start();
        bike.stop();

        System.out.println();

        bus.start();
        bus.stop();
    }
}
