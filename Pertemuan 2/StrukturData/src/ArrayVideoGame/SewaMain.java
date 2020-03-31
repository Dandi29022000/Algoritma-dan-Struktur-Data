/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayVideoGame;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class SewaMain {
    public static void main(String[] args) {
        SewaVideoGame s1 = new SewaVideoGame();
        
        s1.id = 1941720009;
        s1.namaMember = "Dandi Agung Setiawan";
        s1.namaGame = "Mobile Legends Bang-Bang";
        s1.lamaPinjam = 3;
        s1.hargaSewa = 15000;
        s1.tampilData();
        
        System.out.println("Harga Sewa\t\t\t: " + s1.hitungHargaSewa());
    }
}
