/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSortTest;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MergeSortMain {
    public static void main(String[] args) {
        int data[]= {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("==============================");
        System.out.println("Sorting Dengan Merge Sort");
        System.out.println("==============================");
        MergeSort msort= new MergeSort();
        System.out.println("Data Awal :");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println();
        System.out.println("Setelah Diurutkan :");
        msort.printArray(data);
    }
}

