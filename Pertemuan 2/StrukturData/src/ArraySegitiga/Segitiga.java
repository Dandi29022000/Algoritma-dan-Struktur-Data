/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySegitiga;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas(int a, int t){
        return a * t /2;
    }
    
    public double hitungKeliling(int a, int t){
        double f = new Double((a*a) + (t*t));
        return (Math.sqrt(f) * 2) + 2;
    }
}
