package Tugas1;
import java.util.Scanner;

public class LuasBangun {
     public static Scanner input = new Scanner(System.in);
     public static int sisi, tinggi, alas, pilih, hitung, jari2;
     public static double phi = 3.14;
     public static void main(String[] args) {
         do {
         System.out.println("======================================");
         System.out.println("   Program Menghitung Luas Bangun");
         System.out.println("======================================");
         System.out.println("   1. Luas Segitiga");
         System.out.println("   2. Luas Segiempat");
         System.out.println("   3. Luas Lingkaran");
         System.out.println("======================================");
         System.out.print("Masukkan Pilihan Anda : ");
         pilih = input.nextInt();
         System.out.println();
             switch (pilih) {
                case 1:
                    System.out.println("======================================");
                    System.out.println("      Menghitung Luas Segitiga");
                    System.out.println("======================================");
                    luasSegitiga();
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("      Menghitung Luas Segiempat");
                    System.out.println("======================================");
                    luasSegiempat();
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println("      Menghitung Luas Lingkaran");
                    System.out.println("======================================");
                    luasLingkaran();
                    break;
                default:
                    System.out.println("Maaf Layanan Tidak Tersedia!");
                }
        } while (pilih !=3);
     }
     
     static void luasSegitiga() {
         System.out.print("Masukkan alas\t: ");
         alas = input.nextInt();
         System.out.print("Masukkan tinggi\t: ");
         tinggi = input.nextInt();
         hitung = alas * tinggi/2;
         System.out.println("Luas segitiga adalah " + hitung);
     }
     
     static void luasSegiempat(){
         System.out.print("Masukkan sisi\t: ");
         sisi = input.nextInt();
         hitung = sisi * sisi;
         System.out.println("Luas segiempat adalah " + hitung);
     }
     
     static void luasLingkaran() {
         System.out.print("Masukkan jari-jari\t: ");
         jari2 = input.nextInt();
         hitung = (int) phi * (jari2 * jari2);
         System.out.println("Luas lingkaran adalah " + hitung);
     }
}
