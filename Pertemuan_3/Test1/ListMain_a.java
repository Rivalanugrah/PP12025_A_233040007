package Pertemuan_3.Test1;

import Pertemuan_3.Latihan_2dan3.StrukturList;

public  class ListMain_a {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);

        System.out.print("Elemen: ");
        list.displayElement();
    }
}

