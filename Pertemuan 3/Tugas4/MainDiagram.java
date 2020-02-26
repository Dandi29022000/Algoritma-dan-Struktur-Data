/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;
import java.util.Scanner;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainDiagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("    Pemilihan Suara Ketua Umum BEM Tahun 2020");
        System.out.println("==================================================");
        
        Diagram bem = new Diagram();
        Diagram[] bem1 = new Diagram[bem.jumlahKandidat];
        
        for(int i=0; i<bem.jumlahKandidat; i++){
            bem1[i] = new Diagram();
            System.out.print("Nama Kandidat Ke-" + (i+1) + " : ");
            bem1[i].kandidat = sc.nextLine();
        }
        System.out.println("==================================================");
        
        for(int i=0; i<bem.jumlahKandidat; i++){
            System.out.print("Suara Kandidat Ke-" + (i+1) + " : ");
            bem1[i].suara = sc.nextInt();
            bem.jumlahSuara += bem1[i].suara;
        }
        System.out.println("==================================================");
        
        int hasil = bem.hitung(bem.jumlahSuara, bem1[0].suara, bem1[1].suara, bem1[2].suara, bem1[3].suara);
        if(hasil == 0){
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
        } else{
            System.out.println("Ketua BEM yang terpilih adalah " + bem1[hasil-1].kandidat);
        }
    }
}
