package Tugas5;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI 1F
 * NIM      : 1941720009
 */

public class Node {
   int data, weight;
    Node prev;
    Node next;

    Node(Node prev, int data, int weight, Node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
