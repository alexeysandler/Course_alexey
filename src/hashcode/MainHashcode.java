package hashcode;

import javax.naming.NamingEnumeration;
import java.util.*;

public class MainHashcode {
    public static void main(String[] args) {
        Person p = new Person("alexey",2);
        Person p2 = new Person("lior",6);
        Person newP = new Person("kuku",2);
        Person newP2 = new Person("lior",3);
        Person fP = new Person("papa",2);
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(p2);
        personList.add(newP);
        personList.add(newP2);
        for (Person pp : personList){
            if(pp.equals(fP)){
                System.out.println(pp.getName());
            }
        }
//        Map<Person,Integer> myMap = new HashMap<>();
//        myMap.put(p,1);
//        myMap.put(p2,4);
//
//        Integer number = myMap.get(newP);
//        Integer number1 = myMap.get(newP2);
       // System.out.println(number);
      //  System.out.println(number1);

//
//        List<Person> personList = new LinkedList<>();
//        personList.add(p);
//        personList.add(p2);
//        personList.add(newP);
//        personList.add(newP2);
//
//        Iterator<Person> itr = personList.iterator();
//        while (itr.hasNext()){
//            Person personFromList =itr.next();
//            System.out.println(personFromList.getName());
//            if (personFromList.getName().equals("lior")){
//                itr.remove();
//            }
//        }
//        Iterator<Person> itr2 = personList.iterator();
//        while (itr2.hasNext()){
//            Person printPerson = itr2.next();
//            System.out.println(printPerson.getName());
//
//        }







    }
}
