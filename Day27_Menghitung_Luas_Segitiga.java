package dolandre_Febrianto;

import java.util.Scanner;

public class Day27_Menghitung_Luas_Segitiga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Alas Segitiga : ");
        double alas = sc.nextDouble();
        System.out.println("Masukkan Tinggi Segitiga : ");
        double tinggi = sc.nextDouble();

        double luas = alas * tinggi / 2;

        System.out.println("Luas Segitiga Dengan Alas " + alas + " cm " + "  Dan Tinggi " + tinggi + " cm " + " Adalah " + luas + " cm ");
        
        sc.close();

    }

}
