/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import Tugas2.LigaInggris;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class TabelKelasemen {
    LigaInggris ListKelasemen[] = new LigaInggris[20];
    int idx;
    
    public void tambah(LigaInggris l){
        if(idx < ListKelasemen.length){
            ListKelasemen[idx] = l;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    public void tampil(){
        for(LigaInggris l : ListKelasemen){
            l.tampil();
            System.out.println("----------------------------------------------");
            System.out.println();
        }
    }
    
    public void insertionSortAscending(){
        int i, j;
        for(i=1; i<ListKelasemen.length; i++){
            LigaInggris temp = new LigaInggris();
            temp = ListKelasemen[i];
            j=i;
            while((j>0) && (ListKelasemen[j-1].poin > temp.poin)){
                ListKelasemen[j] = ListKelasemen[j-1];
                j--;
            }
            ListKelasemen[j] = temp;
        }
    }
    
    public void insertionSortDescending(){
        int i, j;
        for(i=1; i<ListKelasemen.length; i++){
            LigaInggris temp = new LigaInggris();
            temp = ListKelasemen[i];
            j=i;
            while((j>0) && (ListKelasemen[j-1].poin < temp.poin)){
                ListKelasemen[j] = ListKelasemen[j-1];
                j--;
            }
            ListKelasemen[j] = temp;
        }
    }
}
