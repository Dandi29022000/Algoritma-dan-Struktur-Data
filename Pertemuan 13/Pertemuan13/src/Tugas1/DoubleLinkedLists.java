package Tugas1;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int item) {
        if(isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item) {
        if(isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    // untuk menambah data sesuai index
    public void add(int item, int index) throws Exception {
        //jika data masih kosong
        if(isEmpty()) {
            addFirst(item);
            // cek apakah index melebihi batas
        } else if(index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
            // jika index sudah sesuai, maka perintah dijalankan
        } else {
            // untuk mencari posisi node yang node.next menunjuk ke null
            Node current = head;
            int i = 0;
            while(i < index) {
                current = current.next;
                i++;
            }
            // jika menambah node dimana index node setelah head
            if(current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            // jika menambah node sesuai index
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if(index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null) {
                current.prev.next = null;
            } else if(current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        return head.data;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void cari(int cari) throws Exception {
        Node tmp = head;
        int index = -1;
        int i = 0;
        if(isEmpty()) {
            throw new Exception("Nilai index di luar batas");
        } else {
            while(tmp != null) {
                if(cari == tmp.data) {
                    index = i;
                }
                tmp = tmp.next;
                i++;
            }
            System.out.println("Data ditemukan pada indeks ke-" + index);
        }
    }
}
