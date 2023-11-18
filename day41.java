package dolandrefebrianto;

import java.util.Scanner;

public class day41 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan nilai ; ");
        int d = a.nextInt();
        int s = 0;
        for (int i = 1; i <= d; ++i) {
            System.out.println(i);

            if (i % 2 == 1) {
                s++;

            }

        }
        System.out.println("===================");
        System.out.println("jumlah angka genap : " + s);

    }

}
