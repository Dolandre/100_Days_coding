package dolandre_Febrianto;

import java.util.Scanner;

public class Day40_Input_Gaji_Bersih {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: ");
        int gaji_Pokok = input.nextInt();
        System.out.println("Masukkan Lama Lembur (Dalam Jam): ");
        int lama_Lembur = input.nextInt();
        //Hitung Gaji Lembur
        int gaji_Lembur = lama_Lembur * 55000;
        //Hitung Gaji Bersih
        int gaji_Bersih = gaji_Pokok + gaji_Lembur;
        //Tampilkan Gaji Bersih
        System.out.println("Gaji Bersih : Rp. " + gaji_Bersih);

    }

}
