/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
import Tugas1.TiketPesawat;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        TiketPesawat DaftarPesawat[] = new TiketPesawat[5];
        
        DaftarPesawat[0] = new TiketPesawat("Garuda Indonesia", 750000, 2, 3);
        DaftarPesawat[1] = new TiketPesawat("Batavia Air", 800000, 1, 4);
        DaftarPesawat[2] = new TiketPesawat("Indonesia AirAsia", 650000, 3, 2);
        DaftarPesawat[3] = new TiketPesawat("Lion Air", 950000, 1, 4);
        DaftarPesawat[4] = new TiketPesawat("Citilink", 550000, 2, 4);
        
        for(int i=0; i<5; i++){
            data.tambah(DaftarPesawat[i]);
        }
        
        System.out.println("======================================================");
        System.out.println(" DAFTAR HARGA TIKET PESAWAT PER MASKAPAI PENERBANGAN");
        System.out.println("                    SEBELUM SORTING");
        System.out.println("======================================================");
        data.tampil();
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("        DAFTAR HARGA TIKET SECARA BUBBLE SORT");
        System.out.println("======================================================");
        data.bubbleSort();
        data.tampil();
        
        System.out.println();
        System.out.println("======================================================");
        System.out.println("        DAFTAR HARGA TIKET SECARA SELESCTION SORT");
        System.out.println("======================================================");
        data.selectionSort();
        data.tampil();
    }
}
