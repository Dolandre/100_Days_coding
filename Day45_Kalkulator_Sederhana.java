package dolandre_Febrianto;

import java.util.Scanner;

public class Day45_Kalkulator_Sederhana {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = an.nextDouble();
        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = an.nextDouble();
        
        
        System.out.println("Hasil Penjumlahan : " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan : " + (angka1 - angka2));
        System.out.println("Hasil Perkalian : " + (angka1 * angka2));
        System.out.println("Hasil Pembagian : " + (angka1 / angka2));
        System.out.println("====== T E R I M A K A S I H ======");
        
    }
    
}
