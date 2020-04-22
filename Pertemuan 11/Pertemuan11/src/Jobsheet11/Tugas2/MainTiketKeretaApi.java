/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class MainTiketKeretaApi {
    public static void main(String[] args) {
        TiketKeretaAPi data = new TiketKeretaAPi();
        Scanner sc = new Scanner(System.in);
        
        try {
           data.addFirst(1941720009, "Dandi Agung S.", "Joglokerto/160", "Umum", "Purwokerto(PWT)", "Yogyakarta(YG)", 15000);
           data.print();
           data.add(1941720199, "Hendri Daffa A.", "Argo Anggrek Pagi/2", "Umum", "Gambir(GMR)", "Surabaya Pasar Turi(SBI)", 50000, 1);
           data.print();
           data.addFirst(1941720009, "Qorina Anindhita P.", "Mutiara Selatan", "Umum", "Surabaya Gubeng", "Pasar Senen", 67000);
           data.print();
           data.addByValue(1941720009, 1941720240, "Addina Nurul M.", "Pangandaran", "Umum", "Bandung", "Banjar", 105000);
           data.print();
           data.removeByValue(1941720240);
           data.print();
           data.clear();
           int pilih = 0, pilih1, index, idTiket, harga;
           String nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun;
           
           do {
               System.out.println("===============================");
               System.out.println("--> MENU PEMBELIAN TIKET KA <--");
               System.out.println("===============================");
               System.out.println("|\t1. Tambah");
               System.out.println("|\t2. Hapus");
               System.out.println("|\t3. Cari");
               System.out.println("|\t4, Keluar");
               System.out.println("===============================");
               System.out.print("Masukkan pilihan : ");
               pilih = sc.nextInt();
                   switch(pilih) {
                       case 1:
                           System.out.println();
                           System.out.println("======================");
                           System.out.println("--> Submenu Tambah <--");
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
                                   System.out.println("==========================================");
                                   System.out.println("-------------> Tambah (First) <-----------");
                                   System.out.println("==========================================");
                                   System.out.print("Masukkan Nomor Tiket\t: ");
                                   idTiket = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama Penumpang\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Kereta Api\t: ");
                                   namaKereta = sc.nextLine();
                                   System.out.print("Tipe Penumpang\t\t: ");
                                   jenisPenumpang = sc.nextLine();
                                   System.out.print("Tujuan\t\t:\t ");
                                   tujuanBerangkat = sc.nextLine();
                                   System.out.print("Dari\t\t\t: ");
                                   dariStasiun = sc.nextLine();
                                   System.out.print("Harga\t\t\t: Rp. ");
                                   harga = sc.nextInt();
                                   System.out.println("==========================================");
                                   data.addFirst(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga);
                                   break;
                                   
                               case 2:
                                   System.out.println();
                                   System.out.println("==========================================");
                                   System.out.println("------------> Tambah (Index) <------------");
                                   System.out.println("==========================================");
                                   System.out.print("Masukkan Nomor Tiket\t: ");
                                   idTiket = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama Penumpang\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Kereta Api\t: ");
                                   namaKereta = sc.nextLine();
                                   System.out.print("Tipe Penumpang\t\t: ");
                                   jenisPenumpang = sc.nextLine();
                                   System.out.print("Tujuan\t\t\t: ");
                                   tujuanBerangkat = sc.nextLine();
                                   System.out.print("Dari\t\t\t: ");
                                   dariStasiun = sc.nextLine();
                                   System.out.print("Harga\t\t\t: Rp. ");
                                   harga = sc.nextInt();
                                   data.addFirst(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga);
                                   System.out.print("Masukkan Indeks\t: ");
                                   index = sc.nextInt();
                                   System.out.println("==========================================");
                                   data.add(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga, index);
                                   break;
                                   
                               case 3:
                                   System.out.println();
                                   System.out.println("==========================================");
                                   System.out.println("     Tambah (Last)");
                                   System.out.println("==========================================");
                                    System.out.print("Masukkan Nomor Tiket\t: ");
                                   idTiket = sc.nextInt();
                                   sc.nextLine();
                                   System.out.print("Masukkan Nama Penumpang\t: ");
                                   nama = sc.nextLine();
                                   System.out.print("Masukkan Kereta Api\t: ");
                                   namaKereta = sc.nextLine();
                                   System.out.print("Tipe Penumpang\t\t: ");
                                   jenisPenumpang = sc.nextLine();
                                   System.out.print("Tujuan\t\t\t: ");
                                   tujuanBerangkat = sc.nextLine();
                                   System.out.print("Dari\t\t\t: ");
                                   dariStasiun = sc.nextLine();
                                   System.out.print("Harga\t\t\t: Rp. ");
                                   harga = sc.nextInt();
                                   System.out.println("==========================================");
                                   data.addLast(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga);
                                   break;   
                           }
                           data.print();
                           break;
                       case 2:
                           System.out.println();
                           System.out.println("=====================");
                           System.out.println("--> Submenu Hapus <--");
                           System.out.println("=====================");
                           System.out.println("1. Hapus (Index)");
                           System.out.println("2. Hapus (Key)");
                           System.out.println("3. Clear");
                           System.out.println("=====================");
                           System.out.print("Masukkan pilihan : ");
                           pilih1 = sc.nextInt();
                           switch(pilih1) {
                               case 1:
                                   System.out.println();
                                   System.out.println("=====================");
                                   System.out.println("--> Hapus (Index) <--");
                                   System.out.println("=====================");
                                   System.out.print("Masukkan Indeks\t: ");
                                   index = sc.nextInt();
                                   System.out.println("=====================");
                                   data.remove(index);
                                   break;
                                   
                               case 2:
                                   System.out.println();
                                   System.out.println("=====================");
                                   System.out.println("---> Hapus (Key) <---");
                                   System.out.println("=====================");
                                   System.out.print("Masukkan Nomor Tiket\t: ");
                                   idTiket = sc.nextInt();
                                   System.out.println("=====================");
                                   data.removeByValue(idTiket);
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
                           System.out.println("---> Submenu Cari <---");
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
                                   System.out.println("---> Cari (Index) <---");
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
                                   System.out.print("Masukkan Nomor Tiket\t: ");
                                   idTiket = sc.nextInt();
                                   System.out.println("======================");
                                   data.cariKey(idTiket);
                                   break;
                           }
                           break;
                       case 4 :
                           System.out.println("\nKeluar Program!");
                           System.exit(0);
                           
                       default:
                           System.out.println("Pilihan Salah!");    
                   }
           } while(pilih != 4);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
