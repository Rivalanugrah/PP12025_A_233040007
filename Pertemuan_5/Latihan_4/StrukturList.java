package Pertemuan_5.Latihan_4;

import Pertemuan_5.Latihan_3.Node;

public class StrukturList {
    private Pertemuan_5.Latihan_3.Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addFirst(int data) {
        Pertemuan_5.Latihan_3.Node newNode = new Pertemuan_5.Latihan_3.Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Pertemuan_5.Latihan_3.Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if (HEAD != null) {
            // Jika hanya satu elemen
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Pertemuan_5.Latihan_3.Node preNode = null;
                Pertemuan_5.Latihan_3.Node lastNode = HEAD;

                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    private void dispose(Pertemuan_5.Latihan_3.Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
