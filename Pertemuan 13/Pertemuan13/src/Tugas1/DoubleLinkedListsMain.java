package Tugas1;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  NIM     : 1941720009
 *  Kelas   : TI-1F
 */
public class DoubleLinkedListsMain {
    public static void menu() {
        System.out.println("==========================================");
        System.out.println("        DOUBLE LINKED LIST DENGAN MENU");
        System.out.println("==========================================");
        System.out.println("Memilih Menu");
        System.out.println("\t1. Tambah Awal");
        System.out.println("\t2. Tambah Akhir");
        System.out.println("\t3. Tambah Data Indeks Tertentu");
        System.out.println("\t4. Hapus Awal");
        System.out.println("\t5. Hapus Akhir");
        System.out.println("\t6. Hapus Indeks Tertentu");
        System.out.println("\t7. Cetak Data");
        System.out.println("\t8. Cari");
        System.out.println("\t9. Keluar");
        System.out.println("==========================================");
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         DoubleLinkedLists obj = new DoubleLinkedLists();
         int pilih, index, data;
         
         try{
            do {
                menu();
                System.out.print("Masukkan pilihan Anda : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data awal : ");
                        data = sc.nextInt();
                        obj.addFirst(data);
                        obj.print();
                        System.out.println();
                        break;
                    
                    case 2:
                        System.out.print("Masukkan data akhir : ");
                        data = sc.nextInt();
                        obj.addLast(data);
                        obj.print();
                        System.out.println();
                        break;
                    
                    case 3:
                        System.out.print("Masukkan indeks\t: ");
                        index = sc.nextInt();
                        System.out.print("Masukkan data\t: ");
                        data = sc.nextInt();
                        obj.add(data, index);
                        obj.print();
                        System.out.println();
                        break;
                    
                    case 4:
                        obj.removeFirst();
                        obj.print();
                        System.out.println("Data indeks awal berhasil dihapus!");
                        System.out.println();
                        break;
                    
                    case 5:
                        obj.removeLast();
                        obj.print();
                        System.out.println("Data indeks akhir berhasil dihapus!");
                        System.out.println();
                        break;
                        
                    case 6:
                        System.out.print("Masukkan indeks yang ingin dihapus : ");
                        index = sc.nextInt();
                        obj.remove(index);
                        obj.print();
                        System.out.println("Data pada indeks ke-" + index + "berhasil dihapus!");
                        System.out.println();
                        break;
                        
                    case 7:
                        obj.print();
                        System.out.println();
                        break;
                        
                    case 8:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        data = sc.nextInt();
                        obj.cari(data);
                        System.out.println();
                        break;
                }
            }while(pilih != 9);
         } catch(Exception e) {
            System.out.println(e.getMessage());
         }
    }
}
