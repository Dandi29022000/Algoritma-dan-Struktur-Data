/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Rata2MataKuliah {
    public String namaMhs[];
    public int jumlah;
    public double rata[];
    public double nilai;
    
    public Rata2MataKuliah(int jumlah){
        this.namaMhs = new String[jumlah];
        this.nilai = 0;
        this.rata = new double[jumlah];
        this.jumlah = jumlah;
    }
    
    double rataDC(double arr[], int a, int b){
        if(a == b){
            return arr[1];
        } else if(a < b){
            int nilai = (a + b) / 2;
            double anilai = rataDC(arr, a, nilai-1);
            double bnilai = rataDC(arr, nilai+1, b);
            return bnilai + anilai + arr[nilai];
        }
        return 0;
    }
}
