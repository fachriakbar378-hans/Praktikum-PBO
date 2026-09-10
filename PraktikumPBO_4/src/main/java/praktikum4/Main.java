/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Main {
    public static void main(String[] args) {
        // 1. Menguji objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Motor", 120, "Bensin");
        System.out.println("=== Info Kendaraan ===");
        kendaraan1.tampilkanInfoKendaraan();

        System.out.println();

        // 2. Menguji objek Mobil (Subclass)
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, "Bensin", 4);
        System.out.println("=== Info Mobil ===");
        mobil1.tampilkanInfoKendaraan(); // Method warisan dari Kendaraan
        mobil1.tampilkanInfoMobil();     // Method khusus milik Mobil
    }
}
