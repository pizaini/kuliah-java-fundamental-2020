package com.pizaini.javafundamental.uas;

import java.util.Scanner;

/**
 * Buatlah program Java dengan ketentuan sebagai berikut:
 * INPUT
 * 1.	Input data berupa NIM, contoh: “11451001001” dengan tipe data String.
 * 2.	Format NIM adalah 11 digit angka. Digit ke-5 merupakan kode dari jurusan.
 * Jika kode jurusan: 1= Teknik Informatika”. 2=Sistem Informasi; 3=Teknik Elektro; 4=Teknik Industri; 5=Matematika Terapan.
 * 4.	Gunakan Scanner mengambil input dari user.
 * 5.	TIDAK diperkenankan menggunakan Regular Expression.
 */
public class Uas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIM Anda ? ");
        String nim = scanner.next();
        /**
         * Validasi jumlah krakter NIM 11 karakter
         * Dalam contoh ini, tidak dicantumkan validasi lain spt validasi angka
         */
        if(nim.length() == 11){
            char character = nim.charAt(4);
            String jurusan  = "Kode "+character+" tidak valid!";
            switch (character){
                case '1':{
                    jurusan = "Teknik Informatika";
                    break;
                }
                case '2':{
                    jurusan = "Sistem Informasi";
                    break;
                }
                case '3':{
                    jurusan = "Teknik Elektro";
                    break;
                }
                case '4':{
                    jurusan = "Teknik Industri";
                    break;
                }
                case '5':{
                    jurusan = "Matematika";
                    break;
                }
            }
            System.out.println("Jurusan Anda adalah: "+jurusan);
        }else {
            System.out.println("NIM Tidak valid."+nim.length());
        }
    }
}
