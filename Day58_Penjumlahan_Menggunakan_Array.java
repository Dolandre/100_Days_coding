package dolandre_Febrianto;

public class Day58_Penjumlahan_Menggunakan_Array {

    public static void main(String[] args) {
        int[] angka = {5, 8, 2, 6, 3, 9};
        int hasil = 0;
        for (int nilai : angka) {
            hasil += nilai;
        }
        System.out.println("Hasil penjumlahan dari nilai pada Array diatas adalah: " + hasil);
    }
}
