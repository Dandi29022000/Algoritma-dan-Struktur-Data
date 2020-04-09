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
public class Nasabah {
    String noRekening, nama;
    public Nasabah() {
        
    }
    
    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }
    
    public void print() {
        System.out.println("Nama Nasabah\t: " + nama);
        System.out.println("Rekening\t: " + noRekening);
        System.out.println("-----------------------------------------");
    }
}
