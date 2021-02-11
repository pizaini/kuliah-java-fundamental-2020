package com.pizaini.javafundamental.uas;

/**
 * Buatlah progam Java menggunakan PERULANGAN dengan output spt berikut:
 * 12345
 * 01234
 * 00123
 * 00012
 * 00001
 */
public class Uas3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            /*
             * Opsi 1 menggunakan String builder
             * Opsi 2 menggunakan string biasa dengan String biasa
             * String s = ""+j
             */
            StringBuilder builder = new StringBuilder();
            for (int j = 1 ; j <= 6 - i; j++){
                builder.append(j);
            }
            /*
            Format result
             */
            String resultWithFormat = String.format("%5s%n", builder.toString());
            /* Replace space ' ' with '0'
             */
            String s = resultWithFormat.replace(' ', '0');
            /* Send output */
            System.out.print(s);
        }
    }
}
