package nodep.stack;

public class MyStack {
    public int pointerOnStack=0;
    private int[] arrayStack;

    public MyStack(int i) {
        arrayStack=new int[i];
    }

    public void push (int receivedNumber)throws ArrayIndexOutOfBoundsException{
        arrayStack[pointerOnStack++]=receivedNumber;

    }

    public int pop()throws ArrayIndexOutOfBoundsException {

       int retNumber=arrayStack[--pointerOnStack];

        return retNumber;

    }

}
