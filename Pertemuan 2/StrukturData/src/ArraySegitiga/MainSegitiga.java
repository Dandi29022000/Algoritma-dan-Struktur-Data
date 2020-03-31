/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySegitiga;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga[] sg = new Segitiga[4];
        Scanner sc = new Scanner(System.in);
        
        sg[0] = new Segitiga(10, 4);
        sg[1] = new Segitiga(20, 10);
        sg[2] = new Segitiga(15, 6);
        sg[3] = new Segitiga(25, 10);
        
        for(int i=0; i<4; i++){
            System.out.println("Segitiga Ke-[" + (i+1) + "]");
            System.out.println("Luas Segitiga\t\t= " + sg[i].hitungLuas(sg[i].alas, sg[i].tinggi));
            System.out.println("Keliling Segitiga\t= " + sg[i].hitungKeliling(sg[i].alas, sg[i].tinggi));
            System.out.println("");
        }
    }
}
