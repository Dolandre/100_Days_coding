package dolandre_Febrianto;

import java.util.LinkedList;

public class Day12_Membuat_Objek_Dari_Kelas_LinkedList {
    public static void main(String[] args) {
        //membuat class dari linnkedList
        LinkedList<String>listBenda = new LinkedList<String>();
        
        //menginput elemen ke linkedList
        listBenda.add("Meja");
        listBenda.add("Kursi");
        listBenda.add("Buku");
        listBenda.add("Bangku");
        listBenda.add("Ban");
        
        System.out.println(listBenda);
        
    }
    
}
