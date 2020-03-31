/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayJualBeliTanah;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class JualBeliTanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JualBeliTanah jbt1 = new JualBeliTanah();
        
        System.out.print("Masukkan Jumlah Tanah\t: ");
		jbt1.jumlah = sc.nextInt();
		
		JualBeliTanah[] tanah = new JualBeliTanah[jbt1.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new JualBeliTanah();

			System.out.print("\nMasukkan Panjang Tanah Ke-" + (i+1) + " : ");
			tanah[i].panjang = sc.nextInt();
			System.out.print("Masukkan Lebar Tanah Ke-" + (i+1) + " : ");
			tanah[i].lebar = sc.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah Ke-" + (i+1) + " : " + jbt1.hitungLuasTanah(tanah[i].panjang , tanah[i].lebar));
		}
    }
}
