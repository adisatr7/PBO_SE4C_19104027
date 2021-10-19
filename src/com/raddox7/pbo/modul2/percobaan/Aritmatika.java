package com.raddox7.pbo.modul2.percobaan;

public class Aritmatika {
    public static void main(String[] args) {

        // -- Contoh operasi Aritmatika pada bilangan bulat --

        System.out.println("Operasi aritmetika " + "pada tipe integer");

        int a = 2 + 1;          // Penjumlahan
        int b = a - 1;          // Pengurangan
        int c = a * b;          // Perkalian
        int d = c / 3;          // Pembagian
        int e = -a;             // Negasi(?)

        // Output
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Nilai d: " + d);
        System.out.println("Nilai e: " + e);
        System.out.println();


        // -- Contoh operasi Aritmatika pada bilangan desimal --

        System.out.println("Operasi aritmetika " + "pada tipe floating-point");

        double fa = 2 + 1;      // Penjumlahan
        double fb = fa - 1;     // Pengurangan
        double fc = fa * fb;    // Perkalian
        double fd = fc / 3;     // Pembagian
        double fe = -fa;        // Negasi(?)

        // Output
        System.out.println("Nilai fa: " + fa);
        System.out.println("Nilai fb: " + fb);
        System.out.println("Nilai fc: " + fc);
        System.out.println("Nilai fd: " + fd);
        System.out.println("Nilai fe: " + fe);
    }
}
