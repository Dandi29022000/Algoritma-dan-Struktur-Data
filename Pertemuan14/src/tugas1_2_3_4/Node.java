package tugas1_2_3_4;

/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node() {
    }
    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}