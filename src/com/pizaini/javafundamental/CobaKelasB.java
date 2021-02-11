package com.pizaini.javafundamental;

import java.util.Locale;

public class CobaKelasB {
    public static void main(String[] asdasdadadadadad) {
        System.out.println("Looping 0 sd 6, STEP + 3");
        double pi = Math.PI;
        System.out.println(pi);
        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"
    }
}
