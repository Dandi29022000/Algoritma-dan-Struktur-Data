/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBalok;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Balok {
    int panjang;
    int lebar;
    int tinggi;
    
    Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
