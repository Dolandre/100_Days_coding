package dolandre_Febrianto;

import java.util.Scanner;

public class Day34_Menghitung_Volume_Kubus {

    public static void main(String[] args) {
        Scanner B = new Scanner(System.in);

        System.out.println("Masukkan sisi rusuk Kubus : ");
        double sisi = B.nextDouble();

        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus Adalah " + volume + " cm3");

    }

}
