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
public class StackKalimatTerbalikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat\t: ");
        String kalimat = sc.nextLine();
        String kata[] = kalimat.split("\\s+");
        StackKalimatTerbalik tumpukan = new StackKalimatTerbalik(kata.length);
        
        for(int i=0; i<kata.length; i++){
            tumpukan.push(kata[i]);
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
