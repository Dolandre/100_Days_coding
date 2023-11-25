package dolandre_Febrianto;

import java.util.Scanner;

public class Day48_Mencari_Nilai_Minimal_Dan_Nilai_Maksimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka Pertama: ");
        int angka = sc.nextInt();
        
        System.out.print("Masukkan Angka Kedua: ");
        int angka1 = sc.nextInt();

        int nilaiMin = Math.min(angka, angka1 );
        int nilaiMax = Math.max(angka, angka1);

        System.out.println("Nilai Minimal: " + nilaiMin);
    
        System.out.println("Nilai Maksimal: " + nilaiMax);
    }

}
