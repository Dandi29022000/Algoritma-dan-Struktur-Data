/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramJajarGenjang;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class JajarGenjang {
    public int tinggi, panjang, sisiMiring;
    
    int hitungLuas() {
        return panjang * tinggi;
    }
    
    int hitungKeliling() {
        return 2 * (panjang + sisiMiring);
    }
}
