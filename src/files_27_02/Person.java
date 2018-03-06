package files_27_02;

import java.io.Serializable;

public class Person implements Serializable{
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
    return (o instanceof Person && ((Person) o).name.equals(this.name));
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
