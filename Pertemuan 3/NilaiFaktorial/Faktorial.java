/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiFaktorial;

/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n){
       int fakto = 1;
       int i=1;
       while (i <= n) {
           fakto = fakto * i;
           i++;
       }
       return fakto;
       // int fakto = 1;
       // for(int i=1; i<=n; i++){
          //  fakto = fakto * i;
        //}
       // return fakto;    
    }
    
    public int faktorialDC(int n){
        if(n == 1){
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
