/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJobsheet3;

import java.util.Scanner;

/**
 *
 * @author fajar
 */
public class MainNilaiAlgoritma{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        NilaiAlgoritma a=new NilaiAlgoritma();
        System.out.println("======= PROGRAM PERHITUNGAN NILAI AKHIR ========");
        System.out.print("Masukkan nilai tugas : ");
        a.nilaiTugas= sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        a.nilaiKuis= sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        a.nilaiUTS= sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        a.nilaiUAS= sc.nextInt();
        
        System.out.println("total Nilai adalah " +a.hitungTotalNilai());
    }
}
