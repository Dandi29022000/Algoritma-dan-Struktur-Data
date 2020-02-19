/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjects;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class PersegiPanjang1 {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for(int i=0; i<3; i++) {
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang Ke-" + i);
            System.out.print("Masukkan Panjang\t: ");
            ppArray[0].panjang = sc.nextInt();
            System.out.print("Masukan Lebar\t: ");
            ppArray[0].lebar = sc.nextInt();
        }
        
        for(int i=0; i<3; i++) {
            System.out.println("Persegi Panjang Ke-" + i);
            System.out.println("Panjang : " + ppArray[0].panjang + ", Lebar : " + ppArray[0].lebar  );
        }
    }
}
