package com.pizaini.javafundamental;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StaticMethod {
    /**
     * Method:
     * 1. jenis: void atau non-void
     * 2. Parameters
     * 3. Static atau non static
     *
     * method test1(): NON STATIC + VOID + Tanpa parameter
     */
    public void test1(){
        System.out.println("Memanggil method test1");
    }

    /**
     * STATIC + VOID + Tanpa parameter
     */
    public static void test2(){
        System.out.println("Memenggil method test2");
    }

    /**
     * STATIC + NON VOID + Tanpa parameter
     * @return
     */
    public static boolean test3(){
        System.out.println("Memanggil method test3");
        return true;
    }

    /**
     * NON STATIC + NON VOID + Parameters
     * @param a
     * @param b
     * @return
     */
    public int test4(String a, int b){
        System.out.println("Memqnggil method test4");
        return 0;
    }

    /**
     * Jenis method: static void
     * Main method
     * Method yang pertama kali dijalankan saat running program Java
     * @param args
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\filesaya\file.png");
        try {
            Files.delete(path);
        } catch (IOException e) {
            
        }
    }
}
