package minggu8;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Stack {
    int size;
    int top;
    int data[];
    
    public Stack(int size){
      this.size = size;
      data = new int[size];
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
    
    public void push(int dt){
      if(!IsFull()){
        top++;
        data[top] = dt;
      } else{
        System.out.println("Isi stack penuh");
      }
    }
    
    public void pop(){
      if(!IsEmpty()){
        int x = data[top];
        top--;
        System.out.println("Data yang keluar : " + x);
      } else{
        System.out.println("Stack masih kosong");
      }
    }
    
    public void peek(){
      System.out.println("Elemen teratas : " + data[top]);
    }
    
    public void print(){
      System.out.println("Isi stack : ");
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
