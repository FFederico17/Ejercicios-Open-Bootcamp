package com.openBootcamp;

public class tiposDeDatos {

    public static void main(String[] args) {

        // Numéricos enteros:

        byte num1 = 1;
        short num2 = 4;
        int num3 = 54;
        long num4 = 884;

        // Numéricos decimales:

        float num5 = 32.87f;
        double num6 = 224.91;

        // Booleanos:

        boolean bool1 = true;
        boolean bool2 = false;

        // Texto:

        char txt1 = 'f';
        String text2 = "Tipos de datos en Java.";

        // Impresiones:

        System.out.println("Los datos numéricos enteros son byte: " + num1 + ", short: " + num2 +
                ", int: " + num3 + " y long: " + num4);
        System.out.println("Los datos numéricos decimales son float: " + num5 +
                " y double: " + num6);
        System.out.println("Los datos booleanos son " + bool1 + " y " + bool2);
        System.out.println("Los datos de tipo texto son char: " + txt1 + " y String: " + text2);


    }
}
