package HoMeWork.Exercise_7_Serialize;

import java.util.Objects;

public class Circle extends Shape{
    private Integer radius;

    public Circle(Point p, int radius) {
        super(p);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
    return (o instanceof Circle && ((Circle)o).equals(this.radius));
    }

    @Override
    public int hashCode() {

        return radius != null ? radius.hashCode() : 0 ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
