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
public class JajarGenjangMain {
    public static void main(String[] args) {
        JajarGenjang jg1 = new JajarGenjang();
        
        jg1.panjang = 10;
        jg1.tinggi = 7;
        jg1.sisiMiring = 8;
        
        System.out.println("Luas Jajar Genjang\t\t= " + jg1.hitungLuas());
        System.out.println("Keliling Jajar Genjang\t\t= "+ jg1.hitungKeliling());
    }
}
