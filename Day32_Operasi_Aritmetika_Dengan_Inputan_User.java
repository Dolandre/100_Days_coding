package dolandre_Febrianto;

import java.util.Scanner;

public class Day32_Operasi_Aritmetika_Dengan_Inputan_User {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai A :");
        int a = input.nextInt();
        System.out.println("Masukkan Nilai B :");
        int b = input.nextInt();

        int penjumlahan = a + b;
        int pengurangan = a - b;

        System.out.println("Hasil Penjumlahan Dari Nilai A dan B adalah " + penjumlahan);
        System.out.println("Hasil Pengurangan Dari Nilai A dan B adalah " + pengurangan);
    }

}
