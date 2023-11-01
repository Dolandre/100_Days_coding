package dolandre_Febrianto;

import java.util.Vector;

public class Day24_Vector {
    public static void main(String[] args) {
        // deklarasi dan inialisasi vector menggunakan class Wrapper Integer
        Vector <Integer> data = new Vector <>();
        data.add(14);
        data.add(25);
        data.add(50);
        data.add(75);
        data.add(100);
        data.add(125);
        System.out.println("Vector of Integer: "+ data);
        data.set(2, 500);
        System.out.println("Vector of Integer: "+ data);
        
    }

}
