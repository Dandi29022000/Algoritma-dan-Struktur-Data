/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiFaktorial;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("===================================================");
        long start = System.nanoTime();
        System.out.println("Hasil faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.nanoTime();
        System.out.println("Waktu eksekusi = " + (end-start) / 1000000 + " milisecond");
        System.out.println("===================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("Waktu eksekusi = " + (end-start) / 1000000 + " milisecond");
        System.out.println("===================================================");
    }  
}
