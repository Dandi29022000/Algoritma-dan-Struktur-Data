package perulangan;
import java.util.Scanner;

public class Perulangan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo;
        
        System.out.print("Masukan Saldo Anda\t= Rp. ");
        saldo = input.nextInt();
        
        for (int i=0; i<12; i++) {
            System.out.println("==================================");
            System.out.println("Saldo Bulan Ke-" + (i + 1) + " = Rp. " + saldo);
            saldo = saldo + (saldo * 2 / 100);
        }
         System.out.println("==================================");
    }
}
