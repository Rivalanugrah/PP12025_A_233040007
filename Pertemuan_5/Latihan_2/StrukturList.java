package Pertemuan_5.Latihan_2;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }
    public boolean isEmpty() {
        return HEAD == null;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
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
    private void dispose(Node temp) {
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
