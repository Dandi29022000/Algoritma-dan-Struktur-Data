/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class ProgramGelangTower {
    static void programGelangTower(int n, char tower1, char tower3, char tower2){
        if(n == 1){
            System.out.println("Pindah 1 gelang dari tower " + tower1 + " ke tower " + tower3);
            return;
        }
        
        programGelangTower(n-1, tower1, tower2, tower3);
        System.out.println("Pindah gelang " + n + " dari tower " + tower1 + " ke tower " + tower3);
        programGelangTower(n-1, tower2, tower3, tower1);
    }
    
    public static void main(String[] args) {
        int n = 4; // jumlah gelang
        programGelangTower(n, 'A', 'C', 'B'); // A, B dan C adalah nama tower
    }
}
