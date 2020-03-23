package Tugas3;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Array1DimensiBinarySearch {
   public int[] data;
   public int jumData;
   
   public Array1DimensiBinarySearch() {

    }
   
   public Array1DimensiBinarySearch(int[] Data, int jmlData) {
        this.jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
   }
    
   public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

   public void TampilData(){
     for(int i=0; i<jumData; i++){
       System.out.print(data[i] + " ");
     }
     System.out.println();
   }
   
   public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    public void mergeSort(int[] data){
        sort(data, 0, data.length-1);
    }
    
    public void merge(int data[], int left, int middle, int right){
        int[] temp = new int[data.length];
        for(int i=left; i<=right; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle +1;
        int c = left;
        
        //membandingkan setiap bagian
        while (a <= middle && b<= right){
            if (temp[a] <= temp[b]){
                data[c] = temp [a];
                a++;
            }else{
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for(int i=0; i<=s; i++){
            data[ c + i ] = temp[ a + i ];
        }     
    }
    //membagi 2 bagian". 
    public void sort(int data[], int left, int right){
            if (left<right){
                int middle = ( left+right )/2;
                sort(data, left, middle);
                sort(data, middle +1, right);
                merge(data, left, middle, right);
        }
    }
    public void printArray(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print( arr[i]+ " " );
        }
        System.out.println();
    }
}
