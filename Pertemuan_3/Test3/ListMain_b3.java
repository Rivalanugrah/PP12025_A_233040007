package Pertemuan_3.Test3;
import Pertemuan_3.Latihan_5.AddHead;

public class ListMain_b3 {
    public static void main(String[] args) {
        AddHead list = new AddHead();
        list.addHead(1);
        list.addHead(4);
        list.addHead(5);
        list.addHead(7);

        System.out.println("Element: ");
        list.display();
    }
}
