package com.pizaini.javafundamental;

public class No73versi16 {
    public static void main(String[] args) {
        ujian();
    }

    public static void ujian(){
        int[] data = {2, 4, 6, 7, 4, 2, 3, 3, 3, 9, 1, 2, 3, 4, 5, 6, 10, 0};
        int[] terurut = new int[data.length];
        int jumlahTerurut = 0;
        for (int i = 0; i < data.length; i++){
            System.out.println("Jumlah terurut: "+jumlahTerurut);
            try{
                System.out.println("Membandingkan "+data[i]+" vs "+data[i+1]);
                if(data[i] < data[i+1]){
                    jumlahTerurut ++;
                }else{
                    terurut[i] = jumlahTerurut;
                    jumlahTerurut = 0;
                }
            }catch (Exception ignore){
            }
        }
        int max = 0;
        for (int i = 0; i < terurut.length; i++){
            if(max < terurut[i]){
                max = terurut[i];
            }
        }
        System.out.println("Jumlah terurut adalah "+(max + 1));
    }
}
