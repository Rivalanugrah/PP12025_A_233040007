package Pertemuan_6.Latihan_2;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);

        System.out.print("List awal: ");
        list.printList(); // Output: 2 6 3 5 1

        list.removeMid(3);
        System.out.print("Setelah removeMid(3): ");
        list.printList(); // Output: 2 6 5 1

        list.removeMid(6);
        list.removeMid(5);
        System.out.print("Setelah removeMid(6) & removeMid(5): ");
        list.printList(); // Output: 2 1
    }
}
