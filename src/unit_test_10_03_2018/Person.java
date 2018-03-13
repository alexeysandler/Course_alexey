package unit_test_10_03_2018;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {

        return (o instanceof Person && ((Person) o).name.equals(this.name));
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
        }
}
