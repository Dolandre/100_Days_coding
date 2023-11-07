package dolandre_Febrianto;

import java.util.Scanner;

public class Day30_MenghitungKelilingPersegi {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        //digunakan untuk meninput nilai sisi persegi
        System.out.println("Masukkan Sisi : ");
        int sisi = sc.nextInt();
       
        int keliling = 4*sisi;
        
        System.out.println("Keliling Persegi adalah " + keliling);
    }
    
}
