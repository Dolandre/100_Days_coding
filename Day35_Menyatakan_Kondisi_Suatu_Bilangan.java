package dolandre_Febrianto;

import java.util.Scanner;

public class Day35_Menyatakan_Kondisi_Suatu_Bilangan {
    public static void main(String[] args) {
        // baris ini berfungsi untuk membuat sebuah objek Snanner baru dengan nama bilangan
        Scanner bilangan = new Scanner (System.in);
       
        System.out.println("Masukkan Sebuah Angka : ");
        int angka = bilangan.nextInt();
        
        if (angka > 0) {
            System.out.println("Angka yang dimasukkan adalah Bilangan Positif");
        } else if (angka < 0 ) {
            System.out.println("Angka yang dimasukkan adalah Bilangan Negatif");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol");
        }
        
    }
    
}
