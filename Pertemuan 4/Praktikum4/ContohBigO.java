/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum4;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class ContohBigO {
    public static void contohBigO(int[] angka){
        System.out.println("Pairs : ");
        int n = angka.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(angka[i] + " - " + angka[j]);
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; i++){
                System.out.println(angka[i] + " - " + angka[j]);
            }
        }
    }
}
