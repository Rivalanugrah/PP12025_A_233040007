package Pertemuan_3.Test1;

import Pertemuan_3.Latihan_2dan3.StrukturList;

public  class ListMain_b {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);

        System.out.print("Elemen: ");
        list.displayElement();
    }
}

