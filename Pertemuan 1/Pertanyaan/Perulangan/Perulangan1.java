package perulangan;
import java.util.Scanner;

public class Perulangan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.println("======================");
        System.out.print("Masukan Angka\t: ");
        angka = input.nextInt();
        System.out.println("======================");
        
        for (int i=0; i<5; i++) {
            angka -= 3;
        }
        
        System.out.println("Hasil Akhir\t= " + angka);
        if (angka %2 == 0) {
            System.out.println("======================================");
            System.out.println("Hasil Akhir Adalah Bilangan Genap!");
            System.out.println("======================================");
        } else {
            System.out.println("======================================");
            System.out.println("Hasil Akhir Adalah Bilangan Ganjil!");
            System.out.println("======================================");
        }
    }

}
