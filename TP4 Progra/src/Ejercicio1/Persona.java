package Ejercicio1;

import java.util.Random;

public class Persona {
    // Haz una clase llamada Persona que siga las siguientes condiciones:
    //Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se
    //accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si
    //quieres añadir algún atributo puedes hacerlo.
    //Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números,
    //cadena vacía para String, etc.). Sexo será hombre por defecto, usa una constante para ello.

    private String nombre = " ";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0.0;
    private double altura = 0.0;

    // Se implantaran varios constructores:
    //▪ Un constructor por defecto.
    //▪ Un constructor con el nombre, edad y sexo, el resto por defecto.
    //▪ Un constructor con todos los atributos como parámetro.

    public Persona() {
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI =generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Los métodos que se implementaran son:
    //▪ calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en m)), si esta
    //fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20
    //y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0 y si devuelve
    //un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que
    //uses constantes para devolver estos valores.
    //▪ esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    //▪ comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H.
    //No sera visible al exterior.
    //▪ toString(): devuelve toda la información del objeto.
    //▪ generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra
    //correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método
    //para que te sea más fácil. No será visible al exterior.
    //▪ Métodos set de cada parámetro, excepto de DNI.

    public String getNombre() {
        return nombre;
    }

    public int calcularIMC(){
        final int var1 = -1;
        final int var2 = 0;
        final int var3 = 1;

        double imc = this.peso / (this.altura * this.altura);

        if (imc < 20){
            return var1;
        } else if ((imc >= 20) && (imc <= 25)) {
            return var2;
        }
        else if (imc > 25){
            return var3;
        }
        else {
            return 405;
        }

    }
    public boolean esMayorDeEdad(){
        return (this.edad >= 18);
    }

    private char comprobarSexo(char sexo){
        if ((sexo == 'H') || (sexo == 'M')){
            return sexo;
        }
        else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String generaDNI(){
        Random numrandom = new Random();

        int numero = numrandom.nextInt(10000000);
        char letra = letraCorrespondienteAlDNI(numero);
        String DNIletra = numero + "-" + letra;
        return DNIletra;
    }

    private char letraCorrespondienteAlDNI(int numero){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
         int restonum = numero % 23;
         return letras.charAt(restonum);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
