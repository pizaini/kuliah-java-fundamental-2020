package com.pizaini.javafundamental.uas;

/**
 * Terdapat sebuah bilangan positif 1 sampai 50. Jika bilangan tersebut genap, bilangan tersebut dikalikan dengan 2 sebanyak angka bilangan tersebut. Jika ganjil, tambahkan langsung ke total.
 *
 * Output:
 * Total dari penjumlahan bilangan tersebut.
 *
 * Misalnya:
 * Angka dari 1 sd 5
 * 1 (ganjil) --> (tambahkan ke total) --> 1
 * 2 (genap) --> 2 x 2 x 2 (dikali dengan 2 sebanyak 2 kali) = jumlah 8
 * 3 (ganjil) --> (tambahkan ke total) --> 3
 * 4 (genap) --> 4 x 2 x 2 x 2 x 2 (dikali dengan 2 sebanyak 4 kali) = jumlah 64
 * 5 (ganjil) --> (tambahkan ke total) --> 5
 *
 * Hasil akhir: 1 + 8 + 3 + 64 + 5 = 81
 */
public class Uas6 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                int jumlah = (int) (i * Math.pow(i, 2));
                total += jumlah;
            }else{
                total += i;
            }
        }
        System.out.println("TOTAL: "+total);
    }
}
