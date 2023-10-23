package dolandre_Febrianto;

import java.util.Scanner;

public class Day15_Hitung_Luas {

    public static void main(String[] args) {
        //Menghitung Luas dan Keliling Persegi
        /*
        L = s x s     (L itu Luas dan S itu sis)
        K = 4 x s      (K itu keliling)
         */
        Scanner input = new Scanner(System.in);
        int s, L, K;
        System.out.print("masukkan s = ");
        s = input.nextInt();
        L = s * s;
        K = 4 * s;
        // Narasi Luas Persegi
        System.out.println("L = s x s");
        System.out.println("L = " + s + " x " + s);
        System.out.println("L = " + L + "cm2\n");
        // Narasi Keliling Persegi
        System.out.println("K = 4 x s");
        System.out.println("K = 4" + " x " + s);
        System.out.println("K = " + K + "\n");
        //Sekian yang saya kerjakan kak//

    }

}


