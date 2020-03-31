/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class StackMain {
   public static void main(String[] args){
     Stack tumpukan = new Stack(4);
     tumpukan.push("Dandi");
     tumpukan.push("Auzan");
     tumpukan.push("Fauzan");
     tumpukan.push("Navis");
     tumpukan.print();
     tumpukan.pop();
     tumpukan.peek();
     tumpukan.print();
   }
}
