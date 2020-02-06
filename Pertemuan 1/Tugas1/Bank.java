package Tugas1;

public class Bank {
    public static void main(String[] args) {
        double awal = 1000000, bunga = 0.02;
        int bulan = 0;
        
        System.out.printf("Saldo Anda\t: Rp %,.2f\n", awal);
        for(bulan=0; awal<1500000; bulan++) {
            awal += awal * bunga;
        }
        
        System.out.printf("Dalam Waktu\t: %d Bulan\nUang Anda\t: Rp. %,.2f\n" , bulan, awal);
    }
}
