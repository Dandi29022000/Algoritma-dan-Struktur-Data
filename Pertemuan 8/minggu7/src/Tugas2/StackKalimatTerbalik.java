/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class StackKalimatTerbalik {
    int size;
    int top;
    String data[];
    
    public StackKalimatTerbalik(){
        
    }
    
    public StackKalimatTerbalik(int size){
      this.size = size;
      data = new String[size];
      top = -1;
    }
    
    public boolean IsEmpty(){
      if(top == -1){
        return true;
      } else{
        return false;
      }
    }
    
    public boolean IsFull(){
      if(top == size-1){
        return true;
      } else {
        return false;
      }
    }
    
    public void push(String dt){
      if(!IsFull()){
        top++;
        data[top] = dt;
      } else{
        System.out.println("Isi stack penuh");
      }
    }
    
    public void pop(){
      if(!IsEmpty()){
        String x = data[top];
        top--;
        System.out.println("Data yang keluar\t: " + x);
      } else{
        System.out.println("Stack masih kosong");
      }
    }
    
    public void peek(){
      System.out.println("Elemen teratas\t\t: " + data[top]);
    }
    
    public void print(){
      System.out.print("Kalimat Dibalik\t\t: ");
      for(int i=top; i>=0; i--){
        System.out.println(data[i] + " ");
      }
      System.out.println("");
    }
    
    public void clear(){
      if(!IsEmpty()){
        for(int i=top; i>=0; i--){
          top--;
        }
        System.out.println("Stack sudah dikosongkan");
      } else{
        System.out.println("Gagal! stack masih kosong");
      }
    }
}
