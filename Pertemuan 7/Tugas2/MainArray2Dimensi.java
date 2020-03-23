package Tugas2;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
import Tugas2.Array2Dimensi;
import java.util.Scanner;

public class MainArray2Dimensi {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int data[][] = {
       {45, 78, 7, 200, 80},
       {90, 1, 17, 100, 50},
       {21, 2, 40, 18, 65}
     };
     Array2Dimensi pencarian = new Array2Dimensi(data, 3, 5);
     
     System.out.println("Isi Array : ");
     pencarian.TampilData();
     System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
     
     System.out.println();
     System.out.println("==============================");
     System.out.println("Menggunakan Sequential Search");
     System.out.println("==============================");
     pencarian.FindSeqSearch(cari);
     if(pencarian.brs != -1 && pencarian.klm != -1){
        System.out.println("Data : " + cari + " ditemukan pada indeks ke-(" + pencarian.brs + ", " + pencarian.klm + ")");
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
   }
}
