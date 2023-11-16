
import java.util.Scanner;

public class Day39_Perpangkatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka Pokok: ");
        int angka_pokok = sc.nextInt();
        System.out.print("Masukkan Pangkat: ");
        int pangkat = sc.nextInt();
        int hasil = 1;
        
        for (int i = 0; i < pangkat; i++) {
            hasil *= angka_pokok;
        }
        System.out.println("Hasil pangkat adalah " + hasil);
        
    }
    
}
