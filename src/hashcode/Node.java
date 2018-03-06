package hashcode;

public class Node {
    private Node nextNode;
    private Person value;
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }



    public Node(Node nextNode, Person value) {
        this.nextNode = nextNode;
        this.value = value;
    }

}
