package Ejercicio12;

public class Autobus implements Vehiculo{
    //  Implemente la interfaz del vehículo en una clase denominada Autobús
    // en cambio, en la clase Autobús, start() imprime : girando la llave para arriba!
    //Mientras que stop() imprime “girando la llave hacia abajo!”

    @Override
    public void start() {
        System.out.println("Girando la llave para arriba!");
    }

    @Override
    public void stop(){
        System.out.println("Girando la llave hacia abajo!");
    }
}
