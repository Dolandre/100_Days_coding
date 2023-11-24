package dolandre_Febrianto;

import java.util.Arrays;
import java.util.Scanner;

public class Day47_Menghitung_Nilai_Median {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah Angka: ");
        int angka = sc.nextInt();
        
        int[] data = new int[angka];
        
        System.out.println("Masukkan Elemen - Elemen Array: ");
        
        for (int i = 0; i < angka; i++) {
            data[i] = sc.nextInt();
        }
        Arrays.sort(data);
        
        double median;
        
        if (angka % 2 == 0) {
            median = (data[angka / 2 - 1] + data[angka / 2 ]) / 2.0;
        } else {
            median = data[angka / 2];
        }
        
        System.out.println("Nilai Median: "+ median);
    }
    
}
