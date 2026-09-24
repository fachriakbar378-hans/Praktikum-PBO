/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    // Menambahkan produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    // Menghitung total harga semua produk setelah diskon
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    // Menampilkan rincian barang dan total belanjaan
    public void tampilkanDetailKeranjang() {
        System.out.println("=== DETAIL KERANJANG BELANJA ===");
        double totalAwal = 0;
        double totalDiskon = 0;

        for (Produk p : listProduk) {
            double diskon = p.hitungDiskon();
            double hargaAkhir = p.getHargaSetelahDiskon();
            totalAwal += p.getHarga();
            totalDiskon += diskon;

            System.out.printf("- %s (%s)\n", p.getNama(), p.getClass().getSimpleName());
            System.out.printf("  Harga Asli    : Rp %,.2f\n", p.getHarga());
            System.out.printf("  Diskon        : Rp %,.2f\n", diskon);
            System.out.printf("  Harga Akhir   : Rp %,.2f\n\n", hargaAkhir);
        }

        System.out.println("=================================");
        System.out.printf("Total Harga Asli        : Rp %,.2f\n", totalAwal);
        System.out.printf("Total Hemat Diskon      : Rp %,.2f\n", totalDiskon);
        System.out.printf("Total Bayar Setelah Diskon: Rp %,.2f\n", hitungTotalHargaSetelahDiskon());
    }
}
