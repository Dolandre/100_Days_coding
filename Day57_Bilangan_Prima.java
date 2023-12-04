package dolandre_Febrianto;

import java.util.Scanner;

public class Day57_Bilangan_Prima {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Masukkan Nilai Batas Atas: ");
        int batas = an.nextInt();
        
        System.out.println("Bilangan Prima adalah: " + batas);
        for (int i = 2; i <= batas; i++) {
            if(isPrima(i)){
                System.out.println(i +" "); 
            }
        }
        
    }
    static boolean isPrima(int angka){
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
