/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
import java.util.Scanner;
import minggu8.Postfix;

public class PostfixMain {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String P, Q;
    System.out.println("Masukkan ekspresi matematika : ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";
    
    int total = Q.length();
    
    Postfix post = new Postfix(total);
    P = post.konversi(Q);
    System.out.println("Postfix : " + P);
  }
}

