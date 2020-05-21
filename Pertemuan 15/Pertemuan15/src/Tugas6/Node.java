package Tugas6;
/**
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI 1F
 * NIM      : 1941720009
 */

public class Node<T> {

    T data;
    Node<T> prev;
    Node<T> next;

    Node(Node prev, T data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}