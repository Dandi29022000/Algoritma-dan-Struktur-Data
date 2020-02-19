/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayNilaiMahasiswa;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class NilaiMahasiswaMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    NilaiMahasiswa nl = new NilaiMahasiswa();

    System.out.print("\nMasukkan Jumlah Mahasiswa : ");
    nl.jumlah = sc.nextInt();

    NilaiMahasiswa[] nilai = new NilaiMahasiswa[nl.jumlah];

    for (int i = 0; i < nilai.length ; i++) {
        nilai[i] = new NilaiMahasiswa();
        System.out.println("\nMahasiswa Ke-" + (i+1));
	System.out.print("Masukkan Nilai Ke-1\t: ");
        nilai[i].nilai1 = sc.nextInt();
	System.out.print("Masukkan Nilai Ke-2\t: ");
        nilai[i].nilai2 = sc.nextInt();
        }

        System.out.println();

    for (int i = 0; i < nilai.length ; i++) {
	System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + nl.max(nilai[i].nilai1 , nilai[i].nilai2));
        }
    }
}

