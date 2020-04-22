/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class Perlengkapan<T> {

    T noBrg, namaBrg, berat, jumlah;
    int beratBrg;
    Perlengkapan<T> next;

    public Perlengkapan(T noBrg, T namaBrg, T berat, T jumlah, Perlengkapan<T> next) {
        this.noBrg = noBrg;
        this.namaBrg = namaBrg;
        this.berat = berat;
        this.jumlah = jumlah;
        this.beratBrg =(int) berat * (int) jumlah;
        this.next = next;
    }
}