/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
import java.util.Scanner;
public class ModifikasiSearching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan jumlah data\t: ");
        int jmlData = sc.nextInt();
        int[] data;
        data = new int[jmlData];
        System.out.println("Masukkan data (angka terkecil ke terbesar)");
        for(int i=0; i<jmlData; i++){
            System.out.print("Data indeks ke-" + i + "\t: ");
            data[i] = sc.nextInt();
        }
        Searching pencarian = new Searching(data, jmlData);
        System.out.println("Isi Array\t:");
        pencarian.TampilData();
        
        System.out.print("Masukkan data yang ingin dicari\t: ");
        int cari = sc.nextInt();
        int posisi;
        System.out.println();
        System.out.println("==============================");
        System.out.println("Menggunakan Sequential Search");
        System.out.println("==============================");
        posisi = pencarian.FindSeqSearch(cari);
        if(posisi != -1){
          System.out.println("Data : " + cari + " ditemukan pada indeks ke-" + posisi);
        } else{
          System.out.println("Data " + cari + "tidak ditemukan!!");
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("  Menggunakan Binary Search");
        System.out.println("==============================");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
