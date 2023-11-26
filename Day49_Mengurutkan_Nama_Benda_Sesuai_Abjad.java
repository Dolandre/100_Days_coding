package dolandre_Febrianto;

import java.util.Arrays;

public class Day49_Mengurutkan_Nama_Benda_Sesuai_Abjad {

    public static void main(String[] args) {
        String[] bendaArray = {"meja", "kursi", "papan", "plastik", "pensil"};

        Arrays.sort(bendaArray);

        System.out.println("Nama Setelah Di Urutkan: ");
        for (String nama : bendaArray) {
            System.out.println(nama);
        }
    }

}
