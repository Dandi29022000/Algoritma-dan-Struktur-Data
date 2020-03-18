/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class Mahasiswa {
   public String nama;
   public int thnMasuk;
   public int umur;
   public double ipk;
   
   public Mahasiswa(){
    
   }
   
   public Mahasiswa(String n, int t, int u, double i){
       nama = n;
       thnMasuk = t;
       umur = u;
       ipk = i;
   }
   
   public void tampil(){
       System.out.println("Nama\t\t: " + nama);
       System.out.println("Tahun Masuk\t: " + thnMasuk);
       System.out.println("Umur\t\t: " + umur);
       System.out.println("IPK\t\t: " + ipk);
   }
}
