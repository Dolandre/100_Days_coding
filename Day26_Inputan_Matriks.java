package dolandre_Febrianto;

import java.util.Scanner;

public class Day26_Inputan_Matriks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print((c++) + "\t");
            }
            System.out.println();
        }
    }

}
