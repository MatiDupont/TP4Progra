package Ejercicio4;

import java.util.Random;

public class CCC {
    // Crear una clase que permita crear cuentas bancarias. La clase ha de tener los siguientes requisitos:
    //Nombre: CCC.
    //Tendrá las siguientes propiedades:
    //▪ saldoDeCuenta, de tipo double.
    //▪ nombreDelTitular, de tipo String.
    //▪ numeroDeCuenta, de tipo long.
    //▪ Constructor de la clase con dos parámetros:
    //▪ nombreDelTitular, de tipo String.
    //▪ saldoDeCuenta, de tipo double.
    // El constructor de la clase CCC será el encargado de establecer:
    //▪ Un nombre para el titular de la cuenta corriente
    //▪ Un saldo inicial para la cuenta corriente.
    //▪ Asignará un número de cuenta corriente, de tipo long, de forma aleatoria.

    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public CCC(double saldoDeCuenta, String nombreDelTitular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = generarNumeroCuentaAleatorio();
    }

    // Métodos de la clase:
    //▪ Se crearán dos setters, uno para hacer ingresos (setIngreso) y otro para
    //hacer reintegros (setReintegro). Se crearán en un objeto de tipo CCC.
    //▪ Se crearán dos getters, uno permitirá obtener el saldo (getSaldoCuenta) de la cuenta corriente y el
    //otro obtendrá los datos generales (getDatosCuenta) de una CCC.
    //▪ Se creará un método (RealizarTransferenciaEntreCuentas) para permitir realizar transferencias de
    //dinero de una cuenta a otra (de una CCC a otra).


    public void setIngreso(double cantidad){
        if (cantidad > 0){
            saldoDeCuenta += cantidad;
        }
    }

    public void setReintegro(double cantidad){
        if ((cantidad > 0) && (saldoDeCuenta - cantidad >= 0)){
            saldoDeCuenta -= cantidad;
        }
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta(){
        return "Titular: " + nombreDelTitular + ", Numero de cuenta: " + numeroDeCuenta + ", Saldo: " + saldoDeCuenta;
    }

    public void realizarTransferenciasEntreCuentas(double monto, CCC cuenta){
        if (monto >= 0 && getSaldoDeCuenta() >= monto){
            cuenta.setIngreso(monto);
            setReintegro(monto);
        }
        else if (monto < 0){
            System.out.println("No es posible realizar la transferencia de un monto negativo o igual a 0");
            System.out.println();
        }
        else if (getSaldoDeCuenta() < monto){
            System.out.println("No hay suficientes fondos para realizar la transferencia");
            System.out.println();
        }
    }

    private long generarNumeroCuentaAleatorio(){
        Random random = new Random();
        long numeroAleatorio = random.nextLong(10000000000L);

        return numeroAleatorio;
    }
}
