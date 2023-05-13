package Ejercicio4;

public class OperacionesBanco {
    public static void main(String[] args) {
        // ▪ La clase CCC se creará en una clase principal llamada OperacionesBanco. En esta clase
        //principal OperacionesBanco se crearán dos instancias de la clase CCC, con el nombre CCC_1 y CCC_2.
        //▪ Para probar la correcta creación de los métodos de CCC, se realizará una transferencia desde
        //la CCC_1 a la CCC_2. Se mostrarán todos los datos de ambas cuentas CCC_1 y CCC_2 para
        //comprobar cómo han quedado.

        CCC CCC_1 = new CCC(5600423, "Matias Dupont");
        CCC CCC_2 = new CCC(71898, "Marco Ustarroz");

        CCC_1.realizarTransferenciasEntreCuentas(5600420, CCC_2);

        System.out.println(CCC_1.getDatosCuenta());
        System.out.println(CCC_2.getDatosCuenta());
    }
}
