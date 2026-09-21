/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama, "Mamalia");
    }

    // Overriding metode bersuara khas Kucing
    @Override
    public void bersuara() {
        System.out.println("Suara      : Meong... Meong...");
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara(); // Memanggil suara khas kucing
    }
}
