package Tugas1;
import java.util.Scanner;

public class Mississipi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] huruf = new char[19];
        int[] jumlahHuruf = new int[19];
        int jumlahHurufBeda = 0;
        String kalimat;
        
        System.out.print("Masukkan Kalimat\t: ");
        kalimat = input.nextLine();
        
        if(kalimat.isEmpty()) {
            System.out.println("Silahkan Isi Kalimat!");
        }
        else {
            huruf[0] = kalimat.charAt(0);
            jumlahHuruf[0] = 1;
            jumlahHurufBeda = 1;
            
            for(int i=1; i<kalimat.length(); i++){
                boolean muncul = false;
                for(int j=0; j<jumlahHurufBeda; j++){
                    if(kalimat.charAt(i) == huruf[j]){
                        muncul = true;
                        jumlahHuruf[j] += 1; 
                    }
                }
                if(!muncul){
                    huruf[jumlahHurufBeda] = kalimat.charAt(i);
                    jumlahHuruf[jumlahHurufBeda] = 1;
                    jumlahHurufBeda++;
                }
            }
            System.out.println("\nHasil\t: ");
            for(int i=0; i<jumlahHurufBeda; i++){
                System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i] + " buah");
            }
        }
    }
}
