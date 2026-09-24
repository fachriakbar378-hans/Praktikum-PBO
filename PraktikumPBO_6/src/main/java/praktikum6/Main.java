/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

public class Main {
    public static void main(String[] args) {
        // --- 1. Uji Polimorfisme Runtime (Overriding) ---
        // Variabel bertipe Hewan, tetapi diisi dengan objek Kucing
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow (karena objek aslinya Kucing)

        // --- 2. Uji Polimorfisme Compile-time (Overloading) ---
        Kucing kucing = new Kucing();
        kucing.makan("ikan");    // Memanggil makan(String makanan)
        kucing.makan("ikan", 2); // Memanggil makan(String makanan, int jumlah)

        // --- 3. Uji pada objek Anjing ---
        Anjing anjing = new Anjing();
        anjing.bersuara();       // Output: Woof (Overriding)
        anjing.makan("daging", 3); // Output: Hewan makan 3 porsi daging (Overloading turunan)
    }
}
