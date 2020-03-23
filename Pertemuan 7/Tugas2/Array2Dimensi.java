package Tugas2;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Array2Dimensi {
   public int[][] data;
   public int jumDataBaris, jumDataKolom, brs = -1, klm = -1;
   
   public Array2Dimensi(int[][] Data,int jmlDataBaris, int jmlDataKolom){
     jumDataBaris = jmlDataBaris;
     jumDataKolom = jmlDataKolom;
     data = new int[jmlDataBaris][jmlDataKolom];
     for(int i=0; i<jumDataBaris; i++){
       for(int j=0; j<jumDataKolom; j++){
         data[i][j] = Data[i][j];
       }
     }
   }
   
   public void FindSeqSearch(int cari){
   for(int i=0; i<jumDataBaris; i++){
     for(int j=0; j<jumDataKolom; j++){
       if(data[i][j] == cari){
         brs = i;
         klm = j;
         break;
       }
     }
   }
   }
   
   public void TampilData(){
   for(int i=0; i<jumDataBaris; i++){
     for(int j=0; j<jumDataKolom; j++){
       System.out.print(data[i][j] + " ");
      }
      System.out.println();
     }
   }
}
