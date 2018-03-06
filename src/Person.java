import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Person {

        public String name;
        private Date date;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", date=" + date + '}';
    }

    public Person(String name) {
        this.name = name;
        date = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
            Person p = new Person("Momo");
            System.out.println(p);

            List<Person> personsList=new ArrayList<Person>();
            for(String personPointer: args){
                personsList.add(new Person(personPointer));
            }
            for (Person pPrint : personsList){
                System.out.println(pPrint);
            }
        System.out.println(getMaxPerson((ArrayList<Person>) personsList));

    }

    private  static Person getMaxPerson(ArrayList<Person> personsList) {
        Person maxNamePerson = personsList.get(0);
        for(int i = 1;i < personsList.size(); i++){
            if(maxNamePerson.getName().compareTo(personsList.get(i).getName())<0){
                maxNamePerson=personsList.get(i);

            }
        }
        return maxNamePerson;

    }

}
