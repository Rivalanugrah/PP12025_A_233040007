package Pertemuan_8.Tes2;

import Pertemuan_8.Node;
import Pertemuan_8.Latihan1.Matakuliah;

public class StrukturList {
    Node HEAD;

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }


    public boolean isEmpty() {
        return (HEAD == null);
    }
}
