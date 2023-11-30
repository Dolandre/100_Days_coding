package dolandre_Febrianto;

import java.util.Scanner;

public class Day_53_Bilangan_Terbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Bilangan: ");
        int jumlah = sc.nextInt();
        
        if (jumlah <= 0){
            System.out.println("Tidak Ada Bilangan Yang Di temukan.");
        } else {
            System.out.println("Masukkan Bilaagan Ke-1: ");
            int bilanganTerbesar = sc.nextInt();
            
            for (int i = 0; i < jumlah; i++) {
                System.out.println("Masukkan BIlangan Ke-" + i + ": ");
                int bilangan = sc.nextInt();
                
                if (bilangan > bilanganTerbesar) {
                    bilanganTerbesar = bilangan;
                }
            }
            System.out.println("Bilangan Terbesar Adalah: " + bilanganTerbesar);
        }
        
    }
    
}
