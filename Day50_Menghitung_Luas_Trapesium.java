package dolandre_Febrianto;

import java.util.Scanner;

public class Day50_Menghitung_Luas_Trapesium {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Sisi Atas Trapesium: ");
        double sisiAtas = input.nextDouble();

        System.out.print("Masukkan Panjang Sisi Bawah Trapesium: ");
        double sisiBawah = input.nextDouble();

        System.out.print("Masukkan Tinggi Trapesium: ");
        double tinggi = input.nextDouble();

        double luasTrapesium = (sisiAtas + sisiBawah) * tinggi / 2;

        System.out.println("Luas Trapesium Adalah: " + luasTrapesium);

    }

}
