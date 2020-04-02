/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujiantengahsemester;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class DataKeluarga {
    public String nama, status;
    public int umur;

    public DataKeluarga(String nm, String sta, int u) {
        nama = nm;
        status = sta;
        umur = u;
    }

    public void tampil() {
        System.out.println("=========================");
        System.out.println("  DATA ANGGOTA KELUARGA");
        System.out.println("=========================");
        System.out.println("Nama\t: " + nama);
        System.out.println("Posisi\t: " + status);
        System.out.println("Umur\t: " + umur);
        System.out.println("=========================");
    }
}
