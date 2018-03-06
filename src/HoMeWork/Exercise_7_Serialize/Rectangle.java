package HoMeWork.Exercise_7_Serialize;

import files_27_02.Person;

import java.util.Objects;

public class Rectangle extends Shape {
    Point p1;

    public Rectangle(Point p, Point p1) {
        super(p);
        this.p1 = p1;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Rectangle && ((Rectangle)o).p1.equals(p1));
    }

    @Override
    public int hashCode() {

        return p1 != null ? p1.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p1=" + p1 +
                '}';
    }
}
