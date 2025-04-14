package Pertemuan_6.Latihan_1;

public class StrukturList {
    Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addFirst(int data) {
        Node baru = new Node(data);
        baru.setNext(HEAD);
        HEAD = baru;
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Node lastNode = HEAD;
                Node preNode = null;

                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    public void removeMid(int e) {
        Node preNode = new Node(0); // dummy
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;

            while (tempNode != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = HEAD.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}
