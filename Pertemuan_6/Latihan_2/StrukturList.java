package Pertemuan_6.Latihan_2;

public class StrukturList {
    Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void printList() {
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getNilai() + " ");
            temp = temp.getNext();
        }
        System.out.println();
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
        if (!isEmpty()) {
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
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
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
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}
