package dolandre_Febrianto;

import java.util.Scanner;

public class Day31_MenghitungLuasLingkaran {

    public static void main(String[] args) {
        final double u = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jari-jari lingkaran; ");
        double jariJari = input.nextDouble();
        double luas = u * jariJari * jariJari;

        System.out.println("Luas linkaran dengan jari-jari " + jariJari + "cm" + " Adalah " + luas + "cm");
    }

}
