/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA TUGAS HEWAN ===");
        Kucing kucing = new Kucing("Mimi");
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing("Doggo");
        anjing.tampilkanInfo();

        System.out.println("\n=== UJI COBA HIERARKI 3 LEVEL KENDARAAN ===");
        Mobil mobil = new Mobil();
        mobil.nama = "Civic Turbo";
        mobil.kecepatan = 220;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "RX-King";
        motor.kecepatan = 150;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-Tak";
        motor.tampilkanInfo();
    }
}
