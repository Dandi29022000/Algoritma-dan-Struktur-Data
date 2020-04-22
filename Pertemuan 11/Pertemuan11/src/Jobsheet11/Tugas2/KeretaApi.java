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
public class KeretaApi<T> {
    T idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga;
    KeretaApi<T> next;
    
    public KeretaApi(T idTiket, T nama, T namaKereta, T jenisPenumpang, T tujuanBerangkat, T dariStasiun, T harga, KeretaApi<T> next) {
     this.idTiket = idTiket;
     this.nama = nama;
     this.namaKereta = namaKereta;
     this.jenisPenumpang = jenisPenumpang;
     this.tujuanBerangkat = tujuanBerangkat;
     this.dariStasiun = dariStasiun;
     this.harga = harga;
     this.next = next;
    }
}
