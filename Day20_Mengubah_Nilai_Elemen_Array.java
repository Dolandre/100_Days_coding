package dolandre_Febrianto;

import java.util.Arrays;

public class Day20_Mengubah_Nilai_Elemen_Array {

    public static void main(String[] args) {
        // Membuat array 1 dimensi
        int[] dolanArray = {1, 2, 3, 4, 5};

        // Mengakses elem array
        System.out.println(dolanArray[0]);
        System.out.println(dolanArray[2]);
        
        System.out.println(Arrays.toString(dolanArray));
        System.out.println("----------------------------------");

        // Mengubah nilai elemen array
        dolanArray[1] = 14;
        System.out.println(Arrays.toString(dolanArray));

    }

}
