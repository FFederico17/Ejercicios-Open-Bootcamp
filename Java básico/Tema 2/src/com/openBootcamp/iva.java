package com.openBootcamp;

public class iva {

    public static void main(String[] args) {

        double result1 = ivaIncluded(2764);
        double result2 = ivaIncluded(429);
        double result3 = ivaIncluded(88);
        double result4 = ivaIncluded(227417);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

    static double ivaIncluded(double price) {
        return price + price * 0.21;
    }
}