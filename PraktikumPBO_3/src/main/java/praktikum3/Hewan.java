/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Hewan {
    // Atribut diubah jadi private (Encapsulation)
    private String nama;
    private int umur;

    // Constructor (namanya sama persis dengan nama Class)
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter & Setter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter untuk Umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan bersuara");
    }

    public void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur() + " tahun");
    }
    
    public void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}
