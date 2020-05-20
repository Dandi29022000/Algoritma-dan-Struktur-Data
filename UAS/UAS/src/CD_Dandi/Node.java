/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD_Dandi;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class Node {
    String judul, distributor;
    int kode, stok, rusak;
    Node prev, next;
    
    Node(Node prev, String judul, String distributor, int kode, int stok, int rusak, Node next) {
        this.prev = prev;
        this.judul = judul;
        this.distributor = distributor;
        this.kode = kode;
        this.stok = stok;
        this.rusak = rusak;
        this.next = next;
    }
}
