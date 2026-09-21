/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

// Kelas Turunan (Subclass) Mobil
public class Mobil extends Kendaraan {
    // Atribut tambahan spesifik untuk Mobil
    int jumlahPintu;

    // Overriding metode tampilkanInfo dari kelas Induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo() milik Kendaraan
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
