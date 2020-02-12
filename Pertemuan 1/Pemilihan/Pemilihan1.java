package pemilihan;
import java.util.Scanner;

public class Pemilihan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, uts, uas, nilaiAkhir, hitungTugas, hitungUts, hitungUas;
        
        System.out.println("=======================================");
        System.out.print("Masukan Nilai Tugas Anda\t: ");
        tugas = input.nextDouble();
        
        if (tugas < 0 || tugas > 100) {
            System.out.println("Input Yang Anda Masukan Salah!");
            tugas = 0;
        }
        
        System.out.print("Masukan Nilai UTS Anda\t\t: ");
        uts = input.nextDouble();
        
        if (uts < 0 || uts > 100) {
            System.out.println("Input Yang Anda Masukan Salah");
            uts = 0;
        }
        
        System.out.print("Masukan Nilai UAS Anda\t\t: ");
        uas = input.nextDouble();
        
        if (uas < 0 || uas > 100) {
            System.out.println("Input Yang Anda Masukan Salah");
            uas = 0;
        }

        hitungTugas = tugas * 20 / 100;
        hitungUts = uts * 35 / 100;
        hitungUas = uas * 45 / 100;
        nilaiAkhir = hitungTugas + hitungUas + hitungUts;
        System.out.println("=======================================");
        System.out.println("\t20% Nilai Tugas\t= " + hitungTugas);
        System.out.println("\t35% Nilai UTS\t\t= " + hitungUts);
        System.out.println("\t45% Nilai UAS\t\t= " + hitungUas);
        System.out.println("=======================================");
        System.out.println("\tNilai Akhir Anda\t= " + nilaiAkhir);
        System.out.println("=======================================");
    }
}
