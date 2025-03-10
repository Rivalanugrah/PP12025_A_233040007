package Pertemuan_4.Latihan;

public class StrukturList {
    Node HEAD;

    // Konstruktor untuk inisialisasi linked list kosong
    public StrukturList() {
        this.HEAD = null;
    }

    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        if (position == 1) {
            newNode.next = HEAD;
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        Node prevNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        prevNode.next = newNode;
        newNode.next = curNode;
    }
}