package lesson_4_03_2017.binary_tree;

public class Node {
    private int value;
    private Node leftSon;
    private Node rightSon;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeftSonEmpty(){
        return leftSon == null;
    }
    public boolean isRightSonEmpty(){
        return rightSon == null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftSon=" + leftSon +
                ", rightSon=" + rightSon +
                '}';
    }
}
