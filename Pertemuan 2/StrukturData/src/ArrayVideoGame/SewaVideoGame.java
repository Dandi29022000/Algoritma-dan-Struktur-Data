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
public class SewaVideoGame {
    public String namaMember, namaGame;
    int id, lamaPinjam, hargaSewa;
    
    void tampilData() {
        System.out.println("ID Member\t\t\t: " + id);
        System.out.println("Nama Member\t\t\t: " + namaMember);
        System.out.println("Nama Game\t\t\t: " + namaGame);
        System.out.println("Lama Peminjaman (hari)\t\t: " + lamaPinjam);
        System.out.println("Harga Sewa (hari)\t\t: " + hargaSewa);
    }
    
    int hitungHargaSewa() {
        return lamaPinjam * hargaSewa;
    }
}
