package dolandre_Febrianto;

import java.util.Scanner;

public class Day28_Menghitung_KelilingSegitiga {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi 1 Segitiga : ");
        double sisi1 = s.nextDouble();
        System.out.println("Masukkan panjang sisi 2 Segitiga : ");
        double sisi2 = s.nextDouble();
        System.out.println("Masukkan sisi 3 Segitiga : ");
        double sisi3 = s.nextDouble();

        double keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling segitiga Adalah " + keliling);
        s.close();
    }

}
