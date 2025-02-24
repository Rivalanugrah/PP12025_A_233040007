package Pertemuan_3.Test3;

import Pertemuan_3.Latihan_5.AddHead;

public class ListMain_a3 {
    public static void main(String[] args) {
        AddHead list = new AddHead();
        list.addHead(3);
        list.addHead(2);
        list.addHead(1);

        System.out.println("Element: ");
        list.display();
    }
}
