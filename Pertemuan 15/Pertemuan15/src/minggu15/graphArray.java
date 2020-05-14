package minggu15;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class graphArray {
    private final int vertices;
    private int[][] twoD_array;

    public graphArray(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices+1];
    }
    
    public void makeEdge(int to, int from, int edge){
        try {
            twoD_array[to][from] =edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }
    
    public int getEdge(int to, int from){
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int v, e, count = 1, to=0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try {
            System.out.print("Masukkan jumlah vertices\t: ");
            v = sc.nextInt();
            System.out.print("Masukkan jumlahedges\t\t: ");
            e = sc.nextInt();
            graph = new graphArray(v);
            System.out.println("Masukkan edgess: <to> <from>");
            while (count <= e) {
                System.out.print("to   : ");
                to = sc.nextInt();
                System.out.print("from : ");
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb");
            System.out.print(" ");
            for (int i = 1; i <= v; i++) {
                System.out.print(i+" ");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(i+" ");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j)+" ");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error... Silahkan cek kembali");
        }
        sc.close();
    }
}