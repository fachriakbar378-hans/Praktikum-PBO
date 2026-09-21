/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

// Kelas Induk (Superclass)
public class Kendaraan {
    // Atribut dasar kendaraan
    String nama;
    int kecepatan;

    // Metode untuk menampilkan informasi dasar
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
