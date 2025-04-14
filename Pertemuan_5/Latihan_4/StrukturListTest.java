package Pertemuan_5.Latihan_4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);

        System.out.print("List awal: ");
        list.printList(); // 2 -> 6 -> 3 -> 5 -> 1 -> null

        list.removeTail();
        System.out.print("Setelah removeTail: ");
        list.printList(); // 2 -> 6 -> 3 -> 5 -> null

        list.removeHead();
        System.out.print("Setelah removeHead: ");
        list.printList(); // 6 -> 3 -> 5 -> null

        list.removeTail();
        System.out.print("Setelah removeTail lagi: ");
        list.printList(); // 6 -> 3 -> null
    }
}
