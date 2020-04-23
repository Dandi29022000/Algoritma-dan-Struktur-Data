/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2DandiAgungSetiawan;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class TahunPariwisata<T> {
     T bulan, item1, item2, item3;
     TahunPariwisata<T> next;
     
     public TahunPariwisata(T bulan, T item1, T item2, T item3, TahunPariwisata<T> next) {
         this.bulan = bulan;
         this.item1 = item1;
         this.item2 = item2;
         this.item3 = item3;
         this.next = next;
     }
}
