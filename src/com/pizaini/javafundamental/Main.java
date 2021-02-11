package com.pizaini.javafundamental;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] total = new int[5];
        int kali = 2;
        int[] angka = new int[5];
        for (int i=0; i< angka.length; i++){
            angka[i] = input.nextInt();
        }

        for (int i=0; i< angka.length; i++){
            if (angka[i]%2==0){
                total[i] = angka[i] * (int) Math.pow(kali,angka[i]);
                //System.out.println("hasil kali" + total[i]);
            }else {
                total[i] = angka[i];
                //System.out.println("hasil ganjil" + total[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i< total.length; i++){
            sum = sum + total[i];
        }
        System.out.println(sum);
    }
}
