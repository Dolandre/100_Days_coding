package dolandre_Febrianto;

import java.util.LinkedList;

public class Day13_Menghapus_Objek_Dari_Kelas_linkedList {

    public static void main(String[] args) {
        //Membuat Class dari linkedList
        LinkedList<String> listBenda = new LinkedList<String>();

        //menginput elemen ke linkedList
        listBenda.add("Meja");
        listBenda.add("Kursi");
        listBenda.add("Buku");
        listBenda.add("Bangku");
        listBenda.add("Ban");

        System.out.println(listBenda);
        listBenda.remove("Kursi");
        System.out.println(listBenda);
        listBenda.remove(2);
        System.out.println(listBenda);

    }

}
