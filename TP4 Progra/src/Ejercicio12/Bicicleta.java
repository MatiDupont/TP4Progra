package Ejercicio12;

public class Bicicleta implements Vehiculo{
    //  Implemente la interfaz del vehículo en una clase denominada Bicicleta
    // En Bicicleta el método start() imprime en pantalla “arranqué a pedalear”, y el método stop() imprime
    //“no pedaleo más!”
    @Override
    public void start() {
        System.out.println("Arranque a pedalear");
    }

    @Override
    public void stop() {
        System.out.println("No pedaleo mas!");
    }
}
