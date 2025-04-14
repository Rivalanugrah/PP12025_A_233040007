package Pertemuan_5.Latihan_3;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambahkan elemen
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        System.out.print("List awal: ");
        list.printList(); // Output: 7 -> 9 -> 2 -> null

        // Hapus dari head
        list.removeHead();
        System.out.print("Setelah removeHead: ");
        list.printList(); // Output: 9 -> 2 -> null

        // Hapus dari tail
        list.removeTail();
        System.out.print("Setelah removeTail: ");
        list.printList(); // Output: 9 -> null

        // Hapus lagi tail (sisa satu elemen)
        list.removeTail();
        System.out.print("Setelah removeTail lagi: ");
        list.printList(); // Output: null
    }
}
