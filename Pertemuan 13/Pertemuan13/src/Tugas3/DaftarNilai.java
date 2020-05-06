/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class DaftarNilai {
     Mahasiswa head;
    int size;
    
    public DaftarNilai() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new Mahasiswa(null, nama, nilai, null);
        } else {
            Mahasiswa newNode = new Mahasiswa(null, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String nama, int nilai) {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else {
            Mahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            Mahasiswa newNode = new Mahasiswa(current, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(String nama, int nilai, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Mahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Mahasiswa newNode = new Mahasiswa(null, nama, nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Mahasiswa newNode = new Mahasiswa(current.prev, nama, nilai, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nama + "\t\t\t\t|" + tmp.nilai);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    void selectionSort() throws Exception {
        Mahasiswa temp = head;
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        while (temp.next != null) {
            Mahasiswa min = temp;
            Mahasiswa r = temp.next;
 
            while (r != null) {
                if (min.nilai < r.nilai) {
                    min = r;
                }

                r = r.next;
            }
            int x = temp.nilai;
            temp.nilai = min.nilai;
            min.nilai = x;
            temp = temp.next;
        }
    }
}
