package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Person p1 = new Person("alex");
        Person p2 = new Person("lior");
        Person p3 = new Person("zuzu");
        persons.add(p3);
        Collections.sort(persons);

    }
}
