/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTotal;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Total {
    String nama;
    int hargaSatuan;
    int jumlah;
    
    void tampilData(){
        System.out.println("Nama Barang\t: " + nama);
        System.out.println("Harga Satuan\t: " + hargaSatuan);
        System.out.println("Jumlah Barang\t: " + jumlah);
    }
    
    int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
    
    int hitungDiskon(){
        if(hitungHargaTotal() > 100000){
            return (hitungHargaTotal() * 10/100);   
        } else if(hitungHargaTotal() < 50000) {
            return 0;
        } else {
            return (hitungHargaTotal() * 5/100);
        }
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
}
