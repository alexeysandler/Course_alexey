package HoMeWork.Exercise_7_Serialize;

import java.io.Serializable;

public class Shape implements Serializable{
    Point p;

    public Shape(Point p) {
        this.p = p;
    }

}
