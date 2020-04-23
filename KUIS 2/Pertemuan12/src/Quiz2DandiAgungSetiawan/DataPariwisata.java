/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2DandiAgungSetiawan;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class DataPariwisata {
    TahunPariwisata head;
    int size;
    
    public DataPariwisata() {
        head = null;
        size = 0;
    }
    
     public boolean isEmpty() {
        return head == null;
    }
     
    public void addFirst(int bulan, int item1, int item2, int item3) {
        head = new TahunPariwisata(bulan, item1, item2, item3, head);
        size++;
    }
    
     public void add(int bulan, int item1, int item2, int item3, int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!");
        } if(isEmpty() || index == 0) {
            addFirst(bulan, item1, item2, item3, head);
        } else {
            TahunPariwisata tmp = head;
            for(int i=1; i<index; i++) {
                tmp = tmp.next;
            } 
            TahunPariwisata next = (tmp == null) ? null : tmp.next;
            tmp.next = new TahunPariwisata(bulan, item1, item2, item3, next);
            size++;
        }
    }
     
     public void addLast(int bulan, int item1, int item2, int item3) {
        if(isEmpty()) {
            addFirst(bulan, item1, item2, item3);
        } else {
            TahunPariwisata tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            
            tmp.next = new TahunPariwisata(bulan, item1, item2, item3, null);
            size++;
        }
    }
     
     public Object getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.bulan;
    }
     
     public Object getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list kosong!");
        }
        TahunPariwisata tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.bulan;
    }
     
     public Object get(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar baras!");
        }
        TahunPariwisata tmp = head;
        for(int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.bulan;
    }
     
     public void remove(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas!");
        } else if(isEmpty() || index == 0) {
            removeFirst();
        } else {
            TahunPariwisata prev = head;
            TahunPariwisata cur = head.next;
            for(int i=1; i<index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }
     
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if(!isEmpty()) {
            TahunPariwisata tmp = head;
            while(tmp != null) {
                System.out.println(tmp.bulan + "\t\t" + "|" + tmp.item1 + "         |" + tmp.item2 + "          |" + tmp.item3);
                tmp = tmp.next;
            }
            System.out.println("==============================================================");
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    private void addFirst(int bulan, int item1, int item2, int item3, TahunPariwisata head) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
