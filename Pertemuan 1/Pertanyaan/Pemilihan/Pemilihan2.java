package pemilihan;
import java.util.Scanner;

public class Pemilihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("==========PENENTU KELIPATAN 2,6,15==========");
        System.out.print("Masukan Angka\t: ");
        input = sc.nextInt();
        System.out.println("============================================");
        
        if (input %2 == 0 && input %6 == 0 && input %15 == 0) {
            System.out.println("Bilangan Kelipatan 2, 6, 15");
            System.out.println("============================================");
        } else if (input %2 == 0 && input %6 == 0) {
            System.out.println("Bilangan Kelipatan 2, 6");
            System.out.println("============================================");
        } else if (input %6 == 0 && input %15 == 0) {
            System.out.println("Bilangan Kelipatan 6, 15");
            System.out.println("============================================");
        } else if (input %15 == 0 && input %2 == 0) {
            System.out.println("Bilangan Kelipatan 2, 15");
            System.out.println("============================================");
        } else if (input %2 == 0) {
            System.out.println("Bilangan Kelipatan 2");
            System.out.println("============================================");
        } else if (input %6 == 0) {
            System.out.println("Bilangan Kelipatan 6");
            System.out.println("============================================");
        } else if (input %15 == 0) {
            System.out.println("Bilangan Kelipatan 15");
            System.out.println("============================================");
        } else {
            System.out.println("Bilangan Bukan Kelipatan 2, 6, 15!");
            System.out.println("============================================");
        }
    }
}
