package com.pizaini.javafundamental.uas;

/**
 *
 Buatlah program java menggunakan PERULANGAN dengan output spt berikut:
 12345
 23456
 34567
 23456
 12345
 */

public class Uas5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            int resulMod = i % 3;
            int startJ = resulMod + 1;
            if(i >= 3){
                startJ = 3 - (resulMod + 1);
            }
            int endJ = startJ + 5;
            for (int j = startJ; j < endJ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
