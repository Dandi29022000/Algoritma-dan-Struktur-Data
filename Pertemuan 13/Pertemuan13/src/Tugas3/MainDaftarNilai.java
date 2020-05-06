/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class MainDaftarNilai {
    public static void main(String[] args) throws Exception {
        DaftarNilai data = new DaftarNilai();

        System.out.println("-------------------------------------------");
        System.out.println("           DAFTAR NILAI MAHASISWA");
        System.out.println("-------------------------------------------");
        System.out.println("Nama \t\t\t\t|Nilai");
        System.out.println("-------------------------------------------");
        try{
            data.addFirst("Dandi", 95);
            data.addLast("Fauzan", 89);
            data.addLast("Navis", 78);
            data.addLast("Fitri", 87);
            data.addLast("Pram", 93);
            data.addLast("Auzan", 90);
            data.add("Syifaul", 98, 4);
            data.print();
            System.out.println("-------------------------------------------");
        } catch(Exception e) {
             System.out.println(e.getMessage());
        }
        data.selectionSort();
        System.out.println("Data setelah diurutkan secara descending");
        System.out.println("-------------------------------------------");
        System.out.println("Nama \t\t\t\t|Nilai");
        System.out.println("-------------------------------------------");
        data.print();
        System.out.println("-------------------------------------------");
    }    
}
