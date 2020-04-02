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
public class ProgramDataKeluarga {
    DataKeluarga listAnggotaKeluarga[];
    public int idx;
    
    public ProgramDataKeluarga(){
        
    }
    
   public void ProgramDataKeluarga(int array){
       listAnggotaKeluarga = new DataKeluarga[array];
   }
   
   public void tambah(DataKeluarga t) {
        if (idx < listAnggotaKeluarga.length) {
            listAnggotaKeluarga[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }
   
   void tampil() {
        for (DataKeluarga t : listAnggotaKeluarga) {
            t.tampil();
        }
    }
   
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listAnggotaKeluarga[mid].umur) {
                return (mid);
            } else if (listAnggotaKeluarga[mid].umur > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Ada anggota keluarga yang berumur " + x + " tahun");
        } else {
            System.out.println("Tidak ada anggota keluarga yang berumur " + x + " tahun");
        }
    }
   
    public void selectionSortAscending() {
         for (int i = 0; i < listAnggotaKeluarga.length - 1; i++) {
             int idxMin = i;
             for (int j = i + 1; j < listAnggotaKeluarga.length; j++) {
                 if (listAnggotaKeluarga[j].umur < listAnggotaKeluarga[idxMin].umur) {
                     idxMin = j;
                 }
             }
             DataKeluarga tmp = listAnggotaKeluarga[idxMin];
             listAnggotaKeluarga[idxMin] = listAnggotaKeluarga[i];
             listAnggotaKeluarga[i] = tmp;
         }
     }
}
