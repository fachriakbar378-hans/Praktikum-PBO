/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum4;

public class Main {
    public static void main(String[] args) {
        // Buat objek Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Software Engineer", 10000000);

        System.out.println("=== Info Pekerja Awal ===");
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Budi Santoso");

        System.out.println("\n=== Info Pekerja Setelah Ubah Nama ===");
        System.out.println(pekerja1.toString());

  
        System.out.println("\nAkses langsung usia: " + pekerja1.usia); // BISA: protected (dalam package sama)
        System.out.println("Akses langsung pekerjaan: " + pekerja1.pekerjaan); // BISA: public
    }
}
