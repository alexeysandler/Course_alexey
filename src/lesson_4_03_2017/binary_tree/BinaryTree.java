package lesson_4_03_2017.binary_tree;

public class BinaryTree {
    private Node first;



    public void add(Node newNode){
        if(first==null){
            first=newNode;
        }else {
            Node currentNode = first;
            if (currentNode.getValue() > newNode.getValue()){
                if (currentNode.isLeftSonEmpty()){
                    currentNode.setLeftSon(newNode);
                }else {
                    add(currentNode.getLeftSon());
                }
            }else if (currentNode.getValue() < newNode.getValue()){
                if(currentNode.isRightSonEmpty()){
                    currentNode.setRightSon(newNode);
                }else {
                    add(currentNode.getRightSon());
                }
            }
        }
    }
    @Override
    public String toString() {
        return "BinaryTree{" +
                "first=" + first +
                '}';
    }
}
