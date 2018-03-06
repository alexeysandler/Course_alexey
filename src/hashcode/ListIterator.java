package hashcode;

import java.util.Iterator;

public class ListIterator implements Iterator<Person>{

    private Node node;

    public ListIterator(Node node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
   public Person next() {
        Person  currVal = node.getValue();
        node = node.getNextNode();
        return currVal;
    }
}
