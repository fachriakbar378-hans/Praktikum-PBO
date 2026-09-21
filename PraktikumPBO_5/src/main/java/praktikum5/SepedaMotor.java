/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

// Kelas Turunan (Subclass) SepedaMotor
public class SepedaMotor extends Kendaraan {
    // Atribut tambahan spesifik untuk SepedaMotor
    String jenisMesin;

    // Overriding metode tampilkanInfo dari kelas Induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo() milik Kendaraan
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
