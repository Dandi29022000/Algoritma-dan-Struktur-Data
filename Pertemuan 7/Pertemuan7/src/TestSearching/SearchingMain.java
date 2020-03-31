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
import TestSearching.Searching;

public class SearchingMain {
   public static void main(String[] args){
     int data[] = {100, 90, 80, 70, 60, 50, 40, 30};
     Searching pencarian = new Searching(data, 8);
     
     System.out.println("Isi Array : ");
     pencarian.TampilData();
     int cari = 30;
     
     System.out.println();
     System.out.println("==============================");
     System.out.println("Menggunakan Sequential Search");
     System.out.println("==============================");
     int posisi = pencarian.FindSeqSearch(cari);
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

