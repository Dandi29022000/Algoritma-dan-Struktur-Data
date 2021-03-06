/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */

class MaxMin{
    public int maximum;
    public int minimum;
}

public class MinMax {
    public int nilaiArray;
    
     public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, MaxMin hasil){
        int indeks_tengah;
        MaxMin hasil1 = new MaxMin();
        MaxMin hasil2 = new MaxMin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        } else if(indeks_akhir - indeks_awal == 1){
            if(arr[indeks_awal] > arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            } else{
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }
        } else{
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;
        }
    }
}