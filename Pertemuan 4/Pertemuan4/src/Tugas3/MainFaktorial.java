/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainFaktorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //O(1)
        System.out.println("===================================================="); //O(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : "); //O(1)
        int elemen = sc.nextInt(); //O(1)
        
        Faktorial[] fk = new Faktorial[elemen]; //O(1)
        for(int i=0; i<elemen; i++){ //O(n)
            fk[i] = new Faktorial(); //O(1)
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : "); //O(1)
            fk[i].nilai = sc.nextInt(); //O(1)
        }
        
        System.out.println("==================================================="); //O(1)
        long start = System.nanoTime(); //O(1)
        System.out.println("Hasil faktorial dengan Brute Force"); //O(1)
        for(int i=0; i<elemen; i++){ //O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai)); //O(1)
        }
        long end = System.nanoTime(); //O(1)
        System.out.println("Waktu eksekusi = " + (end-start) / 1000000 + " milisecond"); //O(1)
        System.out.println("==================================================="); //O(1)
        System.out.println("Hasil faktorial dengan Divide and Conquer"); //O(1)
        for(int i=0; i<elemen; i++){ //O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai)); //O(1)
        }
        System.out.println("Waktu eksekusi = " + (end-start) / 1000000 + " milisecond"); //O(1)
        System.out.println("==================================================="); //O(1)
    }  
}
 /**
  * Notasi Big O
  * O(1 + 1 + 1 + 1 + 1 + n  x 1 x 1 x 1 + 1 + 1 + 1 + n x 1 x 1 x 1 x 1 x 1 + n x 1 x 1 x 1)
  * O(5 + n + 3 + n + n)
  * O(8 + 3n)
  * O(3n)
  * O(n)
  */