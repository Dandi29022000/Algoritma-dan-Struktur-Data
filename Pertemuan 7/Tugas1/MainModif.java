package Tugas1;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
import Tugas1.BinarySearchModif;
import Tugas1.MergeSort;

public class MainModif {
   public static void main(String[] args){
     int data[] = {100, 90, 80, 70, 60, 50, 40, 30};
     BinarySearchModif pencarian = new BinarySearchModif(data, 8);
     
     System.out.println("Isi Array : ");
     pencarian.TampilData();
     int cari = 30;
     System.out.println(); System.out.println("==============================");
        System.out.println("Sorting Dengan Merge Sort");
        System.out.println("==============================");
        MergeSort msort= new MergeSort();
        System.out.println("Data Awal :");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Setelah Diurutkan :");
        msort.printArray(data);
    
     System.out.println();
     System.out.println("==============================");
     System.out.println("  Menggunakan Binary Search");     System.out.println("==============================");
     int posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
     pencarian.TampilPosisi(cari, posisi);
   }
}
