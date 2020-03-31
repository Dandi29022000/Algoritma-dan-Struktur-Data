/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
import java.util.Scanner;
public class PrefixMain {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String P, Q, eksp = "";
    System.out.println("===========================================");
    System.out.println("    PROGRAM KONVERSI INFLIX KE PREFIX");
    System.out.println("===========================================");
    System.out.println("Masukkan ekspresi matematika\t: ");
    Q = sc.nextLine();
    for(int i=(Q.length()-1); i>=0; i--){
        eksp = eksp + Q.charAt(i);
    }
    eksp = eksp.trim();
    eksp = eksp + "(";
    
    int total = eksp.length();
    
    Prefix pref = new Prefix(total);
    P = pref.konversi(eksp);
    System.out.println("Prefix : " + new  StringBuffer(P).reverse());
    System.out.println("===========================================");
  }
}
