/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Polimorfisme: Objek kelas turunan disimpan dalam tipe Produk
        Produk buku = new Buku("Buku Algoritma & PBO", 100000);
        Produk elektronik = new Elektronik("Laptop Asus", 10000000);
        Produk pakaian = new Pakaian("Jaket Jaket Parka", 250000);

        // Memasukkan produk ke dalam keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Menampilkan hasil perhitungan keranjang
        keranjang.tampilkanDetailKeranjang();
    }
}
