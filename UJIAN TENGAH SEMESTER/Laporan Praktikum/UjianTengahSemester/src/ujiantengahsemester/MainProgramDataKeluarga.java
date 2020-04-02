/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujiantengahsemester;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainProgramDataKeluarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        ProgramDataKeluarga uts = new ProgramDataKeluarga();
        System.out.println("=============================================");
        System.out.println("        PROGRAM DATA ANGGGOTA KELUARGA");
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah anggota keluarga\t: ");
        int jumlahKeluarga = sc.nextInt();
        uts.ProgramDataKeluarga(jumlahKeluarga);
        sc.nextLine();
        
        System.out.println("");
        for (int i = 0; i < jumlahKeluarga; i++) {
            System.out.printf("====Input Data Anggota Keluarga %d====\n", (i + 1));
            System.out.println("Data anggota keluarga ke-" + (i + 1));
            System.out.print("Masukkan Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Masukkan Status\t: ");
            String status = s1.nextLine();
            System.out.print("Masukkan Umur\t: ");
            int umur = sc.nextInt();
            System.out.println();
            
            DataKeluarga dk = new DataKeluarga(nama, status, umur);
            uts.tambah(dk);
        }
        System.out.println("=============================================");
        System.out.println("  Pengurutan Berdasarkan Umur Termuda-Tertua");
        System.out.println("=============================================");
        uts.selectionSortAscending();
        uts.tampil();
        System.out.print("Cari anggota keluarga berdasarkan umur\t: ");
        int cari = sc.nextInt();
        int posisi = uts.FindBinarySearch(cari, 0, jumlahKeluarga);
        uts.Tampilpoisisi(cari, posisi);
    }
}
