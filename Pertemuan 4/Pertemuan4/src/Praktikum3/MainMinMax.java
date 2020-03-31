/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import static Praktikum3.MinMax.max_min;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainMinMax {
    public static void main(String[] args) {
        MinMax[] ppArray = new MinMax[5]; //O(1)
        ppArray[0] = new MinMax(); //O(1)
        Scanner sc = new Scanner(System.in); //O(1)       
        
        for(int i=0; i<5; i++){ // O(n)
            ppArray[i] = new MinMax(); //O(1)
            System.out.println("Nilai Array Indeks Ke-" + i); //O(1)
            System.out.print("Masukkan Nilai : "); //O(1)
            ppArray[i].nilaiArray = sc.nextInt(); //O(1)
        }
       
        int arr[] = new int[5]; // O(1)
        for(int i=0; i<5; i++){ // O(n)
            arr[i] = ppArray[i].nilaiArray; // O(1)
        }
        
        MaxMin hasil = new MaxMin(); // O(1)
        
        max_min(arr, 0, 4, hasil); // O(1)
        
        System.out.println("=====Divide Conquer====="); // O(1)
        System.out.println("Nilai Minimal\t: " + hasil.minimum + "\nNilai Maksimal\t: " + hasil.maximum); // O(1)
        System.out.println("\n"); // O(1)
    }
} 

/**
 * O(1 + 1 + 1 + n x 1 x 1 x 1 x 1 + 1 + n x 1 + 1 + 1 + 1 + 1 + 1)
 * O(3 + n + 1 + n + 5)
 * O(9 + 2n)
 * O(2n)
 * O(n)
 */