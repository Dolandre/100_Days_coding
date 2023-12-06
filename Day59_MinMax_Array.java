package dolandre_Febrianto;

public class Day59_MinMax_Array {

    public static void main(String[] args) {
        int[] angka = {5, 8, 2, 6, 3, 9};

        int nilaiTerkecil = cariNilaiTerkecil(angka);
        System.out.println("Nilai terkecil dalam array: " + nilaiTerkecil);

        int nilaiTerbesar = cariNilaiTerbesar(angka);
        System.out.println("Nilai terbesar dalam array: " + nilaiTerbesar);
    }

    private static int cariNilaiTerkecil(int[] array) {
        int nilaiTerkecil = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < nilaiTerkecil) {
                nilaiTerkecil = array[i];
            }
        }

        return nilaiTerkecil;
    }

    private static int cariNilaiTerbesar(int[] array) {
        int nilaiTerbesar = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > nilaiTerbesar) {
                nilaiTerbesar = array[i];
            }
        }

        return nilaiTerbesar;
    }
}
