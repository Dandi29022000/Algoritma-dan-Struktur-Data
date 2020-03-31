/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jmlMhs = 5;
        
        for(int i=0; i<jmlMhs; i++){
            System.out.println("====================================");
            System.out.println("           DATA MAHASISWA");
            System.out.println("====================================");
            System.out.print("Nama\t\t= ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk\t= ");
            int thn = sc.nextInt();
            System.out.print("Umur\t\t= ");
            int umur = sc.nextInt();
            System.out.print("IPK\t\t= ");
            double ipk = sc.nextDouble();
            System.out.println("====================================");
            System.out.println();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("======================================================");
        System.out.println("          DATA MAHASISWA SEBELUM SORTING");
        System.out.println("======================================================");
        data.tampil();
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("           DATA MAHASISWA SETELAH SORTING ");
        System.out.println("             DI BUBBLESORT (Descending)");
        System.out.println("======================================================");
        data.bubbleSort();
        data.tampil();
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("           DATA MAHASISWA SETELAH SORTING ");
        System.out.println("            DI SELECTIONSORT (Ascending)");
        System.out.println("======================================================");
        data.selectionSort();
        data.tampil();
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("           DATA MAHASISWA SETELAH SORTING");
        System.out.println("            DI INSERTIONSORT (Ascending)");
        System.out.println("======================================================");
        data.insertionSort();
        data.tampil();
    }
}
