package nodep;

public class ProgramNode {
    public static void main(String[] args) {
        MyList currentList = new MyList();
        currentList.add(2);
        currentList.add(4);
        currentList.add(66);
        currentList.add(-2);
        currentList.add(222);
       // currentList.remove(0);

            System.out.println(currentList.toString());

    }
}
