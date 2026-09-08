/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO3; 

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("BMW M3GTR", "GR Yaris", 2023, "Biru");
        Mobil mobil2 = new Mobil("Honda", "Civic Type R", 2024, "Putih");

        mobil1.startEngine();
        mobil1.displayInfo();

        mobil2.startEngine();
        mobil2.displayInfo();

        System.out.println(">>> Mengubah warna mobil " + mobil1.getMerk() + " <<<");
        mobil1.setWarna("Silver Custom");
        mobil1.displayInfo();
    }
}
