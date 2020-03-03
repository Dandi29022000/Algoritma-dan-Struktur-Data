# 2.3.3		Pertanyaan
## 1.	Base line yang mencari nilai faktorial
<img src = '1.PNG'>

Base ini akan mencari nilai faktorial, Divide and Conquer lebih natural dengan skema rekursif yang dilakukan saat pencarian nilai faktorial dari program tersebut. Maksudnya jika nilai n = 1 maka akan di return jika salah akan masuk ke pencarian nilai fakto = n dikalikan (*) dengan faktorialDc (n-1) ;
Dan akan di return nilai fakto-nya.

## 2. 3 bagian itu :
### a.	Divide
 <img src = '2.PNG'>

### b.	Conquer
<img src = '3.PNG'>
 
### c.	Combine
 <img src = '4.PNG'>

## 3.	Bisa dapat diubah dengan while seperti berikut :
 <img src = '5.PNG'>

## 4.	Code program
 
<img src = '6.PNG'>

 
## 5.	Hasil 
<img src = '7.PNG'>

a.	Menggunakan Brute Force
<img src = '8.PNG'>
 
b.	Menggunakan Divide and Conquer
<img src = '9.PNG'>

# 2.4.3	Pertanyaan
## 1.	Perbedaan 2 method PangkatBF() dan PangkatDC()
### a.	PangkatBF() menggunakan perulangan     
<img src = '10.PNG'>

### b.	PangkatDC() menggunakan fungsi rekursif
<img src = '11.PNG'>

## 2.	Potongan kode berikut :
<img src = '12.PNG'>
Dalam kode program tersebut ada penyeleksian angka dimana angka n, jika (n%2) = 1 maka n adalah bilangan ganjil dan akan dikembalikan ke nilai return berupa rekursif yaitu (pangkatDC(a, n/2) * PangkatDC(a, n/2) * a) dan jika salah maka angka n merupakan bilangan genap sehingga akan mengembalikan nilai return rekursif pada (pangkatDC(a, n/2) * pangkatDC(a, n/2));

## 3.	Tahap kombine sudah termaksud
 <img src = '13.PNG'>

## 4.	Penambahan pada Class Pangkat
<img src = '14.PNG'>
 
## 5.	Penambahan pada Class PangkatMain
	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================================");
        System.out.println("            MENGHITUNG NILAI PANGKAT");
        System.out.println("=====================================================");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("=====================================================");
        System.out.print("Masukkan pilihan Anda : ");
        int pilih = sc.nextInt();
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        
        for(int i=0; i<elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang ingin dipangkatkan ke-" + (i+1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            png[i].pangkat = sc.nextInt();
        }
        switch(pilih) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("        Hasil Pangkat dengan Brute Force");
                System.out.println("=====================================================");
                for(int i=0; i<elemen; i++){
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                break;
                }
            
            case 2:
                System.out.println("=====================================================");
                System.out.println("        Hasil Pangkat dengan Divide and Conquer");
                System.out.println("=====================================================");
                for(int i=0; i<elemen; i++){
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                System.out.println("=====================================================");
                break;
                }
                
            default:
                System.out.println("Maaf pilihan yang Anda masukkan tidak valid!");
        }
    }
}

# 2.5.3	Pertanyaan
## 1.	Perbedaan perhitungan 
a)	TotalBF() menggunakan for untuk melakukan perulangan dimana untuk menghitung keuntungan for(i=0; i<=elemen; i++) akan bertambah sampai terpenuhi yang akan dijabarkan dibawah ini :
-	i=0 => total = 0 + keuntungan 1
-	i=1 => total = (0 + keuntungan 1) + keuntungan 2
-	i=2 => total = ((0 + keuntungan 1) + (keuntungan 2) + keuntungan elemen)

b)	TotalDC() menggunakan Divide and Conquer
Misalkan bulan yang kita masukkan = 5, keuntungan = {1, 2, 3, 4, 5}. Jadi perhitungan keuntungan dibagi menjadi 2 bagian kiri Isum dan bagian kanan rsum, yang akan saya jabarkan sebagai berikut :
-	lsum = 1, 2 dan rsum = 4, 5 kemudian nilai mid (tengah) = 3
-	di lsum melakukan perhitungan 1 + 2 = 3
-	di rsum melakukan perhitungan 4 + 5 = 9
Kemudian direturn dengan menjumlahkan lsum + rsum + arr[mid] = 3 + 9 + 3 = 15 (hasil akhir)
## 2.	Cara membatasinya dengan System.out.printf
<img src = '15.PNG'>

## 3.	Kode program tersebut adalah combine dari Divide and Conquer yaitu fungsi totalDC() itu sendiri, dimana fungsi digunakan untuk menggabungkan kembali pemecahan masalah tadi yang telah di conquer sebelumnya. Hasil akhir dari proses tersebut dan untuk menampilkan outputnya.

## 4.	Variable mid berfungsi untuk mengetahui nilai tengah dari array arr[] yang dimana fungsi program mid ini yang mencari keuntungan perbulan yang didapatkan. Keuntungan perbulan yang didapatkan.

## 5.	Kode program
	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
/**
 * Nama     : Dandi Agung Setiaan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================================");
        System.out.println("    Progam Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("=================================================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int elm = sc.nextInt();
        
        for(int i=0; i<elm; i++){
            System.out.println("=================================================================");
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.println("Masukkan jumlah bulan : ");
            int bln = sc.nextInt();
        }
        
        Sum sm = new Sum(elm);
        System.out.println("=================================================================");
        for(int i=0; i<sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke-" + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        
        System.out.println("=================================================================");
        System.out.println("                        Algoritma Brute Force");
        System.out.println("=================================================================");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=================================================================");
        System.out.println("                    Algoritma Divide and Conquer");
        System.out.println("=================================================================");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }

}


