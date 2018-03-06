package lesson_4_03_2017.binary_tree;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node node_1 = new Node(540);
        Node node_2 = new Node(500);
        Node node_3 = new Node(600);
        Node node_4 = new Node(400);
         binaryTree.add(node_1);
        binaryTree.add(node_2);
        binaryTree.add(node_3);
       // binaryTree.add(node_4);
        System.out.println(binaryTree);
    }
}
