/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class MainDaftarMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        
        try{
            data.addFirst(1941720009, "Dandi", "Lumajang");
            data.print();
            data.add(1941720240, "Addina", "Kediri", 1);
            data.print();
            data.addFirst(1941720199, "Hendri", "Bojonegoro");
            data.print();
            data.addByValue(1941720009, 1941720049, "Qorina", "Madiun");
            data.print();
            data.removeByValue(1941720049);
            data.print();
            data.clear();
            int pilih = 0, pilih1, index, nim;
            String nama, alamat;
            do {
               try {
                   System.out.println("===============");
                   System.out.println("     MENU");
                   System.out.println("===============");
                   System.out.println("1. Tambah");
                   System.out.println("2. Hapus");
                   System.out.println("3. Cari");
                   System.out.println("4, Keluar");
                   System.out.println("===============");
                   System.out.print("Masukkan pilihan : ");
                   pilih = sc.nextInt();
                   switch(pilih) {
                       case 1:
                           System.out.println();
                           System.out.println("======================");
                           System.out.println("     Submenu Tambah");
                           System.out.println("======================");
                           System.out.println("1. Tambah (First)");
                           System.out.println("2. Tambah (Index)");
                           System.out.println("3. Tambah (Last)");
                           System.out.println("======================");
                           System.out.print("Masukkan pilihan : ");
                           pilih1 = sc.nextInt();
                           switch(pilih1) {
                               case 1:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Tambah (First)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan NIM\t: ");
                                   nim = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Alamat\t: ");
                                   alamat = sc.nextLine();
                                   System.out.println("======================");
                                   data.addFirst(nim, nama, alamat);
                                   break;
                                   
                               case 2:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Tambah (Index)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan NIM\t : ");
                                   nim = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Alamat\t: ");
                                   alamat = sc.nextLine();
                                   data.addFirst(nim, nama, alamat);
                                   System.out.print("Masukkan Indeks\t: ");
                                   index = sc.nextInt();
                                   System.out.println("======================");
                                   data.add(nim, nama, alamat, index);
                                   break;
                                   
                               case 3:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Tambah (Last)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan NIM\t : ");
                                   nim = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Alamat\t: ");
                                   alamat = sc.nextLine();
                                   System.out.println("======================");
                                   data.addLast(nim, nama, alamat);
                                   break;
                           }
                           data.print();
                           break;
                       case 2:
                           System.out.println();
                           System.out.println("======================");
                           System.out.println("     Submenu Hapus");
                           System.out.println("======================");
                           System.out.println("1. Hapus (Index)");
                           System.out.println("2. Hapus (Key)");
                           System.out.println("3. Clear");
                           System.out.println("======================");
                           System.out.print("Masukkan pilihan : ");
                           pilih1 = sc.nextInt();
                           switch(pilih1) {
                               case 1:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Hapus (Index)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan Indeks\t: ");
                                   index = sc.nextInt();
                                   System.out.println("======================");
                                   data.remove(index);
                                   break;
                                   
                               case 2:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Hapus (Key)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan NIM\t: ");
                                   nim = sc.nextInt();
                                   System.out.println("======================");
                                   data.removeByValue(nim);
                                   break;
                                
                               case 3:
                                   data.clear();
                                   break;
                           }
                           data.print();
                           break;
                       case 3:
                           System.out.println();
                           System.out.println("======================");
                           System.out.println("     Submenu Cari");
                           System.out.println("======================");
                           System.out.println("1. Cari (Index)");
                           System.out.println("2. Cari (Key)");
                           System.out.println("======================");
                           System.out.print("Masukkan pilihan : ");
                           pilih1 = sc.nextInt();
                           switch(pilih1) {
                               case 1:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Cari (Index)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan Indeks\t: ");
                                   index = sc.nextInt();
                                   System.out.println("======================");
                                   data.cari(index);
                                   break; 
                                   
                               case 2:
                                   System.out.println();
                                   System.out.println("======================");
                                   System.out.println("     Cari (Key)");
                                   System.out.println("======================");
                                   System.out.print("Masukkan NIM\t: ");
                                   nim = sc.nextInt();
                                   System.out.println("======================");
                                   data.cariKey(nim);
                                   break;
                           }
                           break;
                       case 4 :
                           System.out.println("\nKeluar Program!");
                           System.exit(0);
                           
                       default:
                           System.out.println("Pilihan Salah!");
                   }
               } catch(Exception e) {
                    System.out.println(e.getMessage());
               }
                System.out.println();
            } while(pilih != 4);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
