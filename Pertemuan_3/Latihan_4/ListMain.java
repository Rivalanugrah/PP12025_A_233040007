package Pertemuan_3.Latihan_4;

import Pertemuan_3.Latihan_2dan3.StrukturList;

public  class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
