package Pertemuan_3.Test2;

import Pertemuan_3.Latihan_5.AddHead;

public class ListMain {
    public static void main(String[] args) {
        AddHead list = new AddHead();
        list.addHead(5);
        list.addHead(4);
        list.addHead(3);

        System.out.print("Element: ");
        list.display();
    }
}
