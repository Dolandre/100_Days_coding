package dolandre_Febrianto;

import java.util.Scanner;

public class Day23_Menggunakan_Inputan_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        String alamat = sc.nextLine();
        int umur = sc.nextInt();
        
        System.out.println("OUTPUT");
        System.out.println("NAMA    :"+ nama);
        System.out.println("ALAMAT  :"+ alamat);
        System.out.println("UMUR    :"+ umur);
    }

}
