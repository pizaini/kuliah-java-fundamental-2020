package com.pizaini.javafundamental.uas;

import java.util.Scanner;

/**
 * Buatlah program Java yang dapat menentukan kelulusan seorang siswa. Dengan ketentuan:
 *
 * input menggunakan Scanner yang menerima masukan:
 * 1. Jalur Masuk (IPA atau IPS)
 * 2. Nilai matematika
 * 3. Nilai bahasa indonesia
 *
 * Proses:
 * Tentukan kelulusan dengan logika berikut:
 * Jalur masuk IPA, syarat lulus adalah nilai matematika minimal 75 dan nilai Bahasa Indonesia mininal 70. Selain itu tidak lulus
 *
 * Jalur masuk IPS, syarat lulus adalah nilai matematika minimal 70 dan nilai bahasa minimal 75. Selain itu tidak lulus.
 *
 * Output:
 * LULUS atau TIDAK LULUS
 */
public class Uas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jurusan (IPA/IPS): ");
        String jaluarMasuk = scanner.next();

        System.out.print("Nilai Matematika: ");
        int matematika = scanner.nextInt();

        System.out.print("Nilai Bahasa Indonesia: ");
        int bahasaIndonesia = scanner.nextInt();
        /**
         * Opsi 1: menggunakan IF
         * Opsi 2: menggunakan swith-case
         */
        String status = "TIDAK LULUS";
        if(jaluarMasuk.equalsIgnoreCase("IPA")){
            if(matematika >= 74 && bahasaIndonesia >= 70){
                status = "LULUS";
            }
        }else if(jaluarMasuk.equalsIgnoreCase("IPS")){
            if(matematika >= 70 && bahasaIndonesia >= 75){
                status = "LULUS";
            }
        }else {
            jaluarMasuk = "TIDAK TERSEDIA";
        }
        /* Send outputs */
        System.out.println("Jalur masuk: "+jaluarMasuk);
        System.out.println(status);
    }
}
