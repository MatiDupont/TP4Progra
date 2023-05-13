package Ejercicio3;

public class Cuenta {
    // Crea una clase llamada Cuenta que tendrá los siguientes atributos:
    //titular y cantidad (puede tener decimales).
    private String titular;
    private double cantidad;

    // El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
    //Crea sus métodos get, set y toString.

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    // Tendrá dos métodos especiales:
    //▪ Ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es
    //negativa, no se hará nada.
    //▪ Retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que
    //nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            }
            else{
                this.cantidad -= cantidad;
            }
        }
    }
}
