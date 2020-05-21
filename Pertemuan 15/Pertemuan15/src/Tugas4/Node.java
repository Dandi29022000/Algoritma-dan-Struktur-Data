package Tugas4;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI 1F
 * NIM      : 1941720009
 */

public class Node {
  int data;
    Node prev;
    Node next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
