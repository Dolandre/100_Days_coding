package dolandre_Febrianto;

import java.util.Scanner;

public class Day_52_Menghitung_Banyaknya_Barang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Barang Awal: ");
        int barangAwal = sc.nextInt();

        System.out.print("Masukkan Jumlah Barang Yang Masuk: ");
        int barangMasuk = sc.nextInt();

        System.out.print("Masukkan Jumlah Barang Yang Keluar: ");
        int barangKeluar = sc.nextInt();

        int barangAkhir = barangAwal + barangMasuk - barangKeluar;
        System.out.println("Jumlah Akhhir Dari Barang Dalam Tokoh: " + barangAkhir);

    }

}
