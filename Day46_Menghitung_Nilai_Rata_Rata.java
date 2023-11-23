package dolandre_Febrianto;

import java.util.Scanner;

public class Day46_Menghitung_Nilai_Rata_Rata {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Angka: ");
        int JumlahAngka = sc.nextInt();

        int total = 0;

        for (int i = 0; i < JumlahAngka; i++) {

            System.out.print("Masukkan Angka Ke- " + (i + 1) + ": ");
            int angka = sc.nextInt();

            total += angka;

        }
        double rata_rata = (double) total / JumlahAngka;
        System.out.println("Nilai Rata-Rata: " + rata_rata);

        sc.close();
    }
}
