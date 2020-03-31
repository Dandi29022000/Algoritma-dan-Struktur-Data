/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import static Tugas2.FibonacciBF.angka;
import static Tugas2.FibonacciBF.fibonacci;
import static Tugas2.FibonacciBF.hitung1;
import static Tugas2.FibonacciBF.hitung2;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainBF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //O(1)
        FibonacciBF[] fb = new FibonacciBF[angka]; //O(1)
        System.out.print("Masukkan Angka : "); //O(1)
        angka = sc.nextInt(); //O(1)
        
        System.out.println("Hasil Bilangan Fibonacci"); //O(1)
        for(int i=0; i<angka; i++){ //O(n)
            if(i == 0 || i == 1){ //O(1)
                continue; //O(1)
            }
            int hitung = hitung1 + hitung2; //O(1)
            System.out.println(hitung1 + " + " + hitung2 + " = " + hitung); //O(1)
            hitung1 = hitung2; //O(1)
            hitung2 = hitung; //O(1)
        }
        System.out.println(); //O(1)
        System.out.println("Hasil Bilangan Fibonacci dengan Brute Force"); //O(1)
        for(int i=0; i<angka; i++){ //O(n)
            int hasil = fibonacci(i); //O(1)
            System.out.print(hasil + " "); //O(1)
        }
        System.out.println(); //O(1)
    }
}
/**
 * Notasi Big O
 * O(1 + 1 + 1 + 1 + 1 + n x (1 + 1) x 1 x 1 x 1 x 1 + 1 + 1 + n x 1 x 1 + 1)
 * O(5 + n x 2 x 1 + 2 + n + 1)
 * O(8 + 2n + n)
 * O(8 + 3n)
 * O(3n)
 * O(n)
 */