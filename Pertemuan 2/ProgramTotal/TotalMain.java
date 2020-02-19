/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTotal;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class TotalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Total t1 = new Total();
        
        System.out.print("Masukkan Nama Barang\t: ");
        t1.nama = sc.nextLine();
        System.out.print("Masukkan Harga Satuan\t: Rp. ");
        t1.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang\t: ");
        t1.jumlah = sc.nextInt();
        System.out.println("");
        t1.tampilData();
        System.out.println("");
        System.out.println("Harga Total\t: " + t1.hitungHargaTotal());
        System.out.println("Diskon\t\t: " + t1.hitungDiskon());
        System.out.println("Harga Bayar\t: " + t1.hitungHargaBayar());
    }
}
