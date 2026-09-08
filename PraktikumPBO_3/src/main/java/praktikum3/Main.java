/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Main {
    public static void main(String[] args) {
        
        Hewan kucing = new Hewan("Lucy", 3);
        kucing.suara();
        kucing.info();

        System.out.println("------------------------");

        Hewan anjing = new Hewan("Darius", 4);
        anjing.info();
        anjing.berlari();
    }
}
