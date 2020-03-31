/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class DiagramGanjil {
    public static int n=4, c1=0, c2=0, c3=0;
    public static int pilihan[] = new int[n];
    
    public static int proses(int a){
        if(a == pilihan.length-1){
            return 0;
        }else
            if(pilihan[a]==1){
                c1+=1;
            }else if(pilihan[a]==2){
                c2+=1;
            }else if(pilihan[a]==3){
                c3++;
            }
        return proses(a+1);
        }
}
