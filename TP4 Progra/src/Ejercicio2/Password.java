package Ejercicio2;

import java.util.Random;

public class Password {
    // Haz una clase llamada Password que siga las siguientes condiciones:
    //Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
    final static int LONG_DEF = 8;
    private StringBuilder contraseña;
    private int longitud;

    // Los constructores serán los siguiente:
    //Un constructor por defecto.
    //Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa
    //longitud.
    public Password() {
        this.longitud = LONG_DEF;
        this.contraseña = generarPassword(LONG_DEF);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
    }

    // Los métodos que implementa serán:
    //▪ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2
    //mayúsculas, mas de 1 minúscula y mas de 5 números.
    //▪ generarPassword(): genera la contraseña del objeto con la longitud que tenga.
    //▪ Método get para contraseña y longitud.
    //▪ Método set para longitud

    final String LOWER_CASE_CARACTERES = "abcdefghijklmnopqrstuvwxyz";
    final String UPPER_CASE_CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String NUMEROS = "0123456789";

    public boolean esFuerte(){
        boolean esFuerte = false;
        int cantMayusculas = 0;
        int cantMinusculas = 0;
        int cantNumeros = 0;

        for (int i = 0; i < contraseña.length(); i++){
            char caracter = contraseña.charAt(i);
            if (UPPER_CASE_CARACTERES.contains(String.valueOf(caracter))){
                cantMayusculas += 1;
            } else if (LOWER_CASE_CARACTERES.contains(String.valueOf(caracter))) {
                cantMinusculas += 1;
            }
            else if (NUMEROS.contains(String.valueOf(caracter))) {
                cantNumeros += 1;
            }
        }

        if ((cantMayusculas >= 2) && (cantMinusculas > 1) && (cantNumeros >= 5)) {
            esFuerte = true;
        }

        return esFuerte;
    }
    private StringBuilder generarPassword(int longitud){

        StringBuilder contraseña = new StringBuilder();
        String caracteres = LOWER_CASE_CARACTERES + UPPER_CASE_CARACTERES + NUMEROS;

        for (int i = 0; i < longitud; i++){
            contraseña.append(getRandomChar(caracteres));
        }

        return contraseña;
    }

    private char getRandomChar(String charSet){
        Random random = new Random();

        int randomIndex = random.nextInt(charSet.length());

        return charSet.charAt(randomIndex);
    }
    public StringBuilder getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Password{" +
                "contraseña=" + contraseña +
                '}';
    }
}
