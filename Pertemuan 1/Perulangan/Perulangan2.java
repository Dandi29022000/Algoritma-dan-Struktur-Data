package perulangan;

import java.util.Scanner;

public class Perulangan2 {

    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        int saldo;
        System.out.print("masukan saldo anda : ");
        saldo = awang.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println("saldo bulan ke-" + (i + 1) + " = " + saldo);
            saldo = saldo + (saldo * 2 / 100);
        }
    }
}
