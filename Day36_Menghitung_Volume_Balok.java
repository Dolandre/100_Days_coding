package dolandre_Febrianto;

import java.util.Scanner;

public class Day36_Menghitung_Volume_Balok {

    public static void main(String[] args) {
        Scanner D = new Scanner(System.in);

        System.out.println("Masukkan Panjang Balok : ");
        int panjang = D.nextInt();
        System.out.println("Masukkan Lebar Balok : ");
        int lebar = D.nextInt();
        System.out.println("Masukkan Tinggi Balok : ");
        int tinggi = D.nextInt();

        int volume = panjang * lebar * tinggi;
        System.out.println("Volume Sebuah Balok Adalah " + volume + " cm");

    }

}
