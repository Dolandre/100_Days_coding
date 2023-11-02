package dolandre_Febrianto;

import java.util.Vector;

public class Day25_Vector_Character {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi Vector menggunakan class wrapper Character
        Vector <Character> data1 = new Vector <>();
        data1.add('@');
        data1.add('#');
        data1.add('^');
        data1.add('&');
        data1.add('%');
        data1.add('D');
        System.out.println("Vector of Character: "+ data1);
        
        int sizeVectorData1 = data1.size();
        System.out.println("Size Data 1: "+ sizeVectorData1 );
        
    }
    
}
