package dolandre_Febrianto;

import java.util.Scanner;

public class Day29_Menghitung_LuasPersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Sisi Persegi : ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("Luas Persegi Dengan Panjang Sisi " + sisi + " cm " + " Adalah " + luas + " cm ");

        input.close();
    }

}
