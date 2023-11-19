package dolandre_Febrianto;

import java.util.Scanner;

public class Day42_Angka_Genap {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int d = a.nextInt();
        int s = 0;
        for (int i = 1; i <= d; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                s++;

            }

        }
        System.out.println("=====================");
        System.out.println("Jumlah Angka Genap : " + s);

    }

}
