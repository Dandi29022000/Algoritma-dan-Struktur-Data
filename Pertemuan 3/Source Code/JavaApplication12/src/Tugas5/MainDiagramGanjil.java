/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

import static Tugas5.DiagramGanjil.c1;
import static Tugas5.DiagramGanjil.c2;
import static Tugas5.DiagramGanjil.c3;
import static Tugas5.DiagramGanjil.pilihan;
import java.util.Scanner;
import static minggu3.MainTugas5.proses;

/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainDiagramGanjil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       //   System.out.println("Masukkan Jumlah Pemilihan :");
      //    n = input.nextInt()
        
        System.out.println("Nama Calon Ketua \n1.Bima \n2.Arian \n3.Darman");
        for(int i=0; i<pilihan.length; i++){
            System.out.println("Masukkan Pilihan Pemilih Ke-"+(i+1));
            pilihan[i] = input.nextInt();
        }
        proses(0);
        System.out.println("Ketua BEM tahun 2020 adalah ");
        if(c1 > c2 && c1 > c3){
            System.out.println("Bima");
        }else if(c2 > c1 && c2 > c3){
            System.out.println("Arlan");
        }else if(c3 > c1 && c3 > c2){
            System.out.println("Darman");
        }
    }
}
