/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class TiketKeretaAPi {
    KeretaApi head;
    int size;
    
    public TiketKeretaAPi() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int idTiket, String nama, String namaKereta, String jenisPenumpang, String tujuanBerangkat, String dariStasiun, int harga) {
        head = new KeretaApi(idTiket, nama,  namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga, head);
        size++;
    }
    
    public void add(int idTiket, String nama, String namaKereta, String jenisPenumpang, String tujuanBerangkat, String dariStasiun, int harga, int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!");
        } if(isEmpty() || index == 0) {
            addFirst(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga);
        } else {
            KeretaApi tmp = head;
            for(int i=1; i<index; i++) {
                tmp = tmp.next;
            } 
            KeretaApi next = (tmp == null) ? null : tmp.next;
            tmp.next = new KeretaApi(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga, next);
            size++;
        }
    }
    
    public void addLast(int idTiket, String nama, String namaKereta, String jenisPenumpang, String tujuanBerangkat, String dariStasiun, int harga) {
        if(isEmpty()) {
            addFirst(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga);
        } else {
            KeretaApi tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            
            tmp.next = new KeretaApi(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga, null);
            size++;
        }
    }
    
    public Object getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.idTiket;
    }
    
    public Object getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list kosong!");
        }
        KeretaApi tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.idTiket;
    }
    
    public Object get(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar baras!");
        }
        KeretaApi tmp = head;
        for(int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.idTiket;
    }
    
    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas!");
        } else if(isEmpty() || index == 0) {
            removeFirst();
        } else {
            KeretaApi prev = head;
            KeretaApi cur = head.next;
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
            KeretaApi tmp = head;
            System.out.println("===========================================");
            System.out.println("----> DATA PEMBELIAN TIKET KERETA API <----");
            System.out.println("===========================================");
            while(tmp != null) {
                System.out.println("Nomor Tiket\t: " + tmp.idTiket);
                System.out.println("Nama Penumpang\t: " + tmp.nama);
                System.out.println("Kereta Api\t: " + tmp.namaKereta);
                System.out.println("Tipe Penumpang\t: " + tmp.jenisPenumpang);
                System.out.println("Tujuan\t\t: " + tmp.tujuanBerangkat);
                System.out.println("Dari\t\t: " + tmp.dariStasiun);
                System.out.println("Harga\t\t: " + tmp.harga);
                System.out.println("===========================================");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong!");
        }
    }
    
    public void addByValue(int cari, int idTiket, String nama, String namaKereta, String jenisPenumpang, String tujuanBerangkat, String dariStasiun, int harga) throws Exception {
        KeretaApi tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while(tmp.next != null) {
            tmp = tmp.next;
            index++;
            if((int) head.idTiket == cari) {
                ditemukan = true;
                break;
            } else if((int) tmp.idTiket == cari) {
                ditemukan = true;
                index++;
                break;
            }
        }
        if(ditemukan) {
            add(idTiket, nama, namaKereta, jenisPenumpang, tujuanBerangkat, dariStasiun, harga, index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
    
    public void removeByValue(int cari) throws Exception {
        KeretaApi tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while(tmp.next != null) {
            tmp =tmp.next;
            index++;
            if((int) head.idTiket == cari) {
                removeFirst();
                break;
            } else if((int) tmp.idTiket == cari) {
                ditemukan = true;
                break;
            }
        }
        if(ditemukan) {
            remove(index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
    
    public void cari(int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!");
        } else {
            KeretaApi tmp = head;
            for(int i=0; i<index; i++) {
                tmp = tmp.next;
            }
            System.out.println("================================");
            System.out.println("Data pada indeks ke-" + index);
            System.out.println("================================");
            System.out.println("Nomor Identitas\t: " + tmp.idTiket);
            System.out.println("Nama Penumpang\t: " + tmp.nama);
            System.out.println("Kereta Api\t: " + tmp.namaKereta);
            System.out.println("Tipe Penumpang\t: " + tmp.jenisPenumpang);
            System.out.println("Tujuan\t: " + tmp.tujuanBerangkat);
            System.out.println("Dari\t: " + tmp.dariStasiun);
            System.out.println("Harga\t: " + tmp.harga);
            System.out.println("================================");
        }
    }
    
    public void cariKey(int cari) throws Exception {
        KeretaApi tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if(isEmpty()) {
            System.out.println("Linked list kosong!");
        } else {
            while(tmp.next != null) {
                tmp =tmp.next;
                if((int) head.idTiket == cari) {
                    ditemukan = true;
                    break;
                } else if((int) tmp.idTiket == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if(ditemukan) {
            System.out.println("Nomor Identitas " + cari + " ditemukan pada indeks ke-" + index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
}
