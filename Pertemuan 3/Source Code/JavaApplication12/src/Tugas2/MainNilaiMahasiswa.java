/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import Tugas1.NilaiMahasiswa;
import Tugas3.Rata2;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("        Program Menghitung Nilai Mahasiswa");
        System.out.println("===================================================");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        System.out.println("===================================================");
        NilaiMahasiswa[] nm = new NilaiMahasiswa[jumlah];
        
        for(int i=0; i<jumlah; i++){
            sc.nextLine();
            nm[i] = new NilaiMahasiswa();
            System.out.print("Mahasiswa Ke-" + (i+1) + " : ");
            nm[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan Nilai Tugas\t: ");
            nm[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis\t: ");
            nm[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS\t: ");
            nm[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS\t: ");
            nm[i].nilaiUAS = sc.nextInt();
            System.out.println("===================================================");
        }
        
        System.out.println("=================================================================");
        System.out.println("Total Nilai Mahasiswa Mata Kuliah Algoritma dan Struktur Data");
        System.out.println("=================================================================");
        
        Rata2 rt = new Rata2();
        for(int i=0; i<jumlah; i++){
            System.out.println("Mahasiswa Ke-" + (i+1) + " : " + nm[i].namaMhs);
            System.out.println("\tNilai Tugas\t: " + nm[i].nilaiTugas + "\tNilai Kuis\t: " + nm[i].nilaiKuis);
            System.out.println("\tNilai UTS\t: " + nm[i].nilaiUTS + "\tNilai UAS\t: " + nm[i].nilaiUAS);
            System.out.println("\tTotal Nilai Mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUTS, nm[i].nilaiUAS));
            rt.total += nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUTS, nm[i].nilaiUAS);
            System.out.println("");
        }
        System.out.println("=================================================================");
        System.out.println("Rata-rata Nilai Total = " + rt.hitungRata(jumlah));
    }
}
