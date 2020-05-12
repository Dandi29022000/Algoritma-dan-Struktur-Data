/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray() {
        data = new int[10];
    }
    
    void populatedDate(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2 * idxStart+1);
            System.out.println(data[idxStart] + " ");
            traverseInOrder(2 * idxStart+2);
        }
    }
}
