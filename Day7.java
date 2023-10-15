package dolandre_Febrianto;

public class Day7 {
    public static void main(String[] args) {
        int angka1 = 20;
        int angka2 = 10;
        
        boolean lebihBesar = angka1 > angka2;
        System.out.println("Apakah Angka1 Lebih Besar Dari Angka2 ? "+lebihBesar);
        
        boolean lebihKecil = angka1 < angka2;
        System.out.println("Apakah Angka1 Lebih Kecil Dari Angka2 ? "+lebihKecil);
        
        boolean samaDengan = angka1 == angka2;
        System.out.println("Apakah Angka1 Sama Dengan Angka2 ? "+samaDengan);
        
        boolean tidak_SamaDengan = angka1 != angka2;
        System.out.println("Apakah Angka1 Tidak Sama Dengan Angka2 ? "+tidak_SamaDengan);
    }
    
    
}
