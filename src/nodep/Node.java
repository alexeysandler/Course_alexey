package nodep;

public class Node {
    public Node(int number, Node next) {
        this.number = number;
        this.next = next;
    }

    private int number;
    private Node next;

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", next=" + next +
                '}';
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int number) {

        this.number = number;

    }



}
