/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;
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
        
         //inisialisasi nilai pada min dan max
        int min = ppArray[0].nilaiArray; // O(1)
        int max = ppArray[0].nilaiArray; // O(1)
        
        for(int i=0; i<5; i++){ // O(n)
            if(ppArray[i].nilaiArray < min){ //O(1)
                min = ppArray[i].nilaiArray; //O(1)
            } else if(ppArray[i].nilaiArray > max){ //O(1)
                max = ppArray[i].nilaiArray; //O(1)
            }
        }
            System.out.println();
            System.out.println("Brute Force"); //O(1) 
            System.out.println("Nilai Minimal\t: " + min); //O(1)
            System.out.println("Nilai Maksimal\t : " + max); //O(1)
    }
}

/**
 * Notasi Big O
 * O(1 + 1 + 1 + n x 1 x 1 x 1 x 1 + 1 + 1 + n x (1 + 1) x (1 + 1) + 1 + 1 + 1)
 * O(3 + n + 2 + 4n + 3)
 * O(8 + 5n)
 * O(5n)
 * O(n)
 */