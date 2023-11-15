package dolandre_Febrianto;

import java.util.Scanner;

public class Day_38_Tipe_Data_String {
    public static void main(String[] args) {
        boolean berhasil = false;
        String username, password, dbUsername, dbPassword;
        dbUsername = "Dolandre";
        dbPassword = "admin";
        
        while(!berhasil){
            Scanner sc = new Scanner (System.in);
            System.out.println("INPUT");
            System.out.println("Masukkan Nama: ");
            username = sc.nextLine();
            System.out.println("Password: ");
            password = sc.nextLine();
            
            System.out.println("OUTPUT");
        if (username.equals(dbUsername) && password.equals(dbPassword)){
            berhasil = true;
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
            System.out.println("Coba Lagi");
        }
            
        }
        
    }
    
}
