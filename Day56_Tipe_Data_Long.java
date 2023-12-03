package dolandre_Febrianto;

import java.util.Scanner;

public class Day56_Tipe_Data_Long {
    public static void main(String[] args) {
        Scanner and = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        String nama = and.nextLine();
        long panjangNama = nama.length();
        System.out.println("Panjang Nama Saya Adalah: " + panjangNama);
    }
    
}
