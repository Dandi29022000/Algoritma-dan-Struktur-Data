/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainRata2 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        
        System.out.println("==================================================");
        System.out.println("    Program Menghitung Rata-rata Mata Kuliah");
        System.out.println("    Menggunakan Algoritma Divide and Conquer");
        System.out.println("==================================================");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = angka.nextInt();
        
        Rata2MataKuliah rt = new Rata2MataKuliah(jumlah);
        System.out.println();
        
        for(int i=0; i<jumlah; i++){
            System.out.print("Nama Mahasiswa Ke-" + (i+1) + " : ");
            rt.namaMhs[i] = huruf.nextLine();
            System.out.print("Masukkan Nilai Ke-" + " : ");
            rt.rata[i] = angka.nextInt();
            System.out.println();
        }
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Nilai " + "(" + rt.namaMhs[i] + ")" + "\t: " + rt.rata[i]);
        }
        
        System.out.println();
        System.out.println("Rata-rata Nilai Mahasiswa : " + rt.rataDC(rt.rata, 0, rt.jumlah));
    }
}
