package Pertemuan_5.Latihan_2;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();
        // 2. Tambah elemen 2 di awal list
        list.addFirst(2);
        // 3. Tambah elemen 9 di awal list
        list.addFirst(9);

        // 4. Tambah elemen 7 di awal list
        list.addFirst(7);

        // 5. Tampilan elemen list
        System.out.print("Elemen list: ");
        list.printList();  // Output: 7 -> 9 -> 2 -> null

        // 6. Hapus elemen list di awal list
        list.removeHead();

        // 7. Tampilan elemen list setelah penghapusan
        System.out.print("Elemen list setelah dihapus: ");
        list.printList();  // Output: 9 -> 2 -> null

        // Lakukan hapus elemen list di awal list sebanyak 3x
        list.removeHead();  // Hapus 9
        list.removeHead();  // Hapus 2
        list.removeHead();  // List menjadi kosong

    }
}
