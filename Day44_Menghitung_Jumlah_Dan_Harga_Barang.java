package dolandre_Febrianto;

import java.util.Scanner;

public class Day44_Menghitung_Jumlah_Dan_Harga_Barang {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Barang Yang Di Ambil: ");
        int Jumlah_Barang = input.nextInt();
        double totalHarga = 0;
        for (int i = 1; i <= Jumlah_Barang; i++) {
            System.out.print("Masukkan Barang Ke- " + i + ": ");
            double Harga_Barang = input.nextDouble();
            totalHarga += Harga_Barang;    
        }
        System.out.println("Total Harga Barang Yang Di Belanja: " +totalHarga);
    }
}
