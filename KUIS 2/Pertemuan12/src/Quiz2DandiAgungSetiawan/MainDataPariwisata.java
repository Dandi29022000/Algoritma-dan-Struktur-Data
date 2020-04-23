/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2DandiAgungSetiawan;
import java.util.Scanner;
/**
 *  Nama    : Dandi Agung Setiawan
 *  Kelas   : TI-1F
 *  NIM     : 1941720009
 */
public class MainDataPariwisata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPariwisata data = new DataPariwisata();
        
        try {
            System.out.println("==============================================================");
            System.out.println("|                     DATA PARIWISATA TAHUNAN                |");
            System.out.println("==============================================================");
            System.out.println("Bulan Ke-\t" + "|" + "2018\t\t" + "|" + "2019\t\t" + "|" + "2020");
            data.addFirst(1, 475544, 2412307, 3743756);
            data.addLast(2, 1985572, 878734, 3398320);
            data.addLast(3, 2076432, 2343240, 983474);
            data.addLast(4, 2165239, 2546836, 923498);
            data.addLast(5, 2283546, 2436456, 2845672);
            data.addLast(6, 2344460, 1943656, 3456566);
            data.addLast(7, 2635040, 2453425, 2341653);
            data.addLast(8, 2958672, 2754240, 2734562);
            data.addLast(9, 3047626, 3256404, 2534400);
            data.addLast(10, 2843543, 3454645, 2346307);
            data.addLast(11, 2734526, 3698200, 943734);
            data.addLast(12, 2523400, 4138479, 2234544);
            data.print();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
