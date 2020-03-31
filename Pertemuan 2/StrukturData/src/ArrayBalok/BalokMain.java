/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBalok;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class BalokMain {
    public static void main(String[] args) {
        Balok[] b1Array = new Balok[3];
        
        b1Array[0] = new Balok(100, 30, 12);
        b1Array[1] = new Balok(120, 40, 15);
        b1Array[2] = new Balok(210, 50, 25);
        
        for(int i=0; i<3; i++){
            System.out.println("Volume Balok Ke-" + i + " : " + b1Array[i].hitungVolume());
        }
    }
}
