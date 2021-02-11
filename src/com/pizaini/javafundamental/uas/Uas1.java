package com.pizaini.javafundamental.uas;

/**
 * Buatlah program Java menggunakan PERULANGAN. Sehingga menghasilkan output seperti berikut:
 * A1 B2 C3 A4 B5 C6 A7 B8 C9 A10 B11 C12 A13 B14 C15 A16 B17 C18 A19 B20
 */

public class Uas1 {
    public static void main(String[] args){
        char[] karakter = new char[]{'A', 'B', 'C'};
        for (int i = 0; i < 20; i++){
            int charIndex = i % 2;
            System.out.print(Character.toString(karakter[charIndex])+ (i+1)+" ");
        }
    }
}
