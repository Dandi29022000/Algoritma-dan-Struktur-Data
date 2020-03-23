package Tugas1;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class BinarySearchModif {
   public int[] data;
   public int jumData;
   
   public BinarySearchModif(int[] Data,int jmlData){
     this.jumData = jmlData;
     data = new int[jmlData];
     for(int i=0; i<jumData; i++){
       data[i] = Data[i];
     }
   }
   public void TampilData(){
     for(int i=0; i<jumData; i++){
       System.out.print(data[i] + " ");
     }
     System.out.println();
   }
   
   public int FindBinarySearch(int cari, int left, int right){
     int mid;
     if(data[left] <= data[right]){
       mid = (left + right) / 2;
       if(cari == data[mid]){
         return mid;
       } else if(cari < data[mid]){
         return FindBinarySearch(cari, left, mid-1);
       } 
     } else if(data[left] >= data[right]){
       mid = (left + right) / 2;
       if(cari == data[mid]){
         return mid;
       } else if(cari < data[mid]){
         return FindBinarySearch(cari, mid+1, right);
       } else{
         return FindBinarySearch(cari, left, mid-1);
       }
     } 
     return -1;
   }
   
   public void TampilPosisi(int x, int pos){
     if(pos != -1){
       System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
     } else{
       System.out.println("Data " + x + " tidak ditemukan!!");
     }
   }
 }
  