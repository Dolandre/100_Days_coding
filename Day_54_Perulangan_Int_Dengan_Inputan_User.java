package dolandre_Febrianto;

import java.util.Scanner;

public class Day_54_Perulangan_Int_Dengan_Inputan_User {
    public static void main(String[] args) {
        int Angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        Angka = input.nextInt();
        System.out.println("___ Angka Yang Habis Di Bagi 5 ___");
        for (int i = 1; i <= Angka; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            
        }
        
    }
    
}
