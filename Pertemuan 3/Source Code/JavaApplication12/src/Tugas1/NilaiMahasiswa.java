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
public class NilaiMahasiswa {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    public int total, jumlah;
       
    public double hitungTotalNilai(int nt, int nk, int nu, int na){
        return ((nt * 0.3) + (nk * 0.2) + (nu * 0.2) + (na * 0.3));
    }
}