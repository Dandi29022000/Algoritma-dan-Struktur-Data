/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class FibonacciBF {
    public int nilaiArray;
    public static int angka;
    public static int hitung1 = 0;
    public static int hitung2 = 1;
    
     static int fibonacci(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        } else {
            return (fibonacci(angka - 1) + fibonacci(angka - 2));
        }
    }
}
