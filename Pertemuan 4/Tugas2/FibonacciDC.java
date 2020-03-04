/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class FibonacciDC {
    public static int n;
    public static int hitung1 = 0;
    public static int hitung2 = 1;
    static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }
}
