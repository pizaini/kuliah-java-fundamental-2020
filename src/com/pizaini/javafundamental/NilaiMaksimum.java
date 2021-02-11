package com.pizaini.javafundamental;

import java.util.Scanner;

public class NilaiMaksimum {
    static void ujian(){
        int test[] = new int[]{1,22,5,3,3};
        test[5] = 10;
        int[] angka = {3, 2, 4, 5, 3, 6, 7, 9};
        int arrayTerurut[] = new int[angka.length];
        int inisialJumlah = 1;

        for (int i = 0; i < angka.length; i++){
            System.out.println("Jumlah terurut saat ni = "+inisialJumlah);
            int nilaiI = angka[i];
            if( i < angka.length - 1){
                int nilaiIPlus1 = angka[i+1];
                if(nilaiI < nilaiIPlus1){
                    inisialJumlah ++;
                }else{
                    arrayTerurut[i] = inisialJumlah;
                    inisialJumlah = 1;
                }
            }
        }
        int nilaiTerbesar = 0;
        for (int i = 0; i < arrayTerurut.length; i++){
            int angkaTerbesar = arrayTerurut[i];
            if(angkaTerbesar > nilaiTerbesar){
                nilaiTerbesar = angkaTerbesar;
            }
        }
        System.out.println("Jumlah terurut = "+nilaiTerbesar);
    }
    public static void main(String[] args){
        ujian();
    }
}
