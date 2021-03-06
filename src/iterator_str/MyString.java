package iterator_str;

import java.util.Iterator;

public class MyString implements Iterable<Character> {

    private String s;

    public MyString(String s) {
        this.s = s;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(s);
    }
}
