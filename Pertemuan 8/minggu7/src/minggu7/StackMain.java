/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
package minggu7;
import java.util.Scanner;
import minggu8.Stack;

public class StackMain {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     Stack tumpukan = new Stack(6);
     
     for(int i=0; i<tumpukan.size; i++){
         System.out.print("Masukkan data\t: ");
         int data = sc.nextInt();
         tumpukan.push(data);
     }
     
     tumpukan.print();
     tumpukan.pop();
     tumpukan.peek();
     tumpukan.print();
   }
}

