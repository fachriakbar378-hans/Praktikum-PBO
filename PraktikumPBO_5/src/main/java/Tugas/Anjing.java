/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama, "Mamalia");
    }

    // Overriding metode bersuara khas Anjing
    @Override
    public void bersuara() {
        System.out.println("Suara      : Guk... Guk...");
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara(); // Memanggil suara khas anjing
    }
}
