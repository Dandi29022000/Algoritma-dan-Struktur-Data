/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BruteForce;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class PencocokanKata {
    public static void tampil(char[] teks, char[] pola){
        int j;
        int cek = 0;
        
        for(int i=0; i<=teks.length - pola.length; i++){
           j=0;
           while(j < pola.length && teks[i + j] == pola[j]){
               j++;
           }
           if(j >= pola.length){
               cek++;
           }
     
        }
        if(cek > 0){
            System.out.println("DATA COCOK");
        } else{
            System.out.println("DATA TIDAK COCOK");
        }   
    }
    
    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        tampil(y, x);
    }
}
