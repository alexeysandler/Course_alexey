package iterator_str;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            MyString mys = new MyString(sc.next());


//        for(char c : s) {
//            System.out.println(c);
//        }
//        for(Iterator<Character> itr = s.iterator();
//            itr.hasNext();
//            System.out.println(itr.next()) );
//    }
            Iterator<Character> itr = mys.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
