package dolandre_Febrianto;

import java.util.Scanner;

public class Day33_MenghitungLuasPersegiPanjang {

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.println("Masukkan Panjang Persegi Panjang : " );
        int panjang = A.nextInt();
        System.out.println("Masukkan Lebar Persegi Panjang : " );
        int lebar = A.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang Adalah " + luas + " cm");

    }

}
