package comparable;


public class Person implements Comparable<Person>{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
    return this.name.compareTo(person.name);
    }
}
