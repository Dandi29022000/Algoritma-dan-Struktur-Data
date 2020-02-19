/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramLingkaran;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        
        System.out.println("Luas Lingkaran\t\t: " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + l1.hitungKeliling());
    }
}
