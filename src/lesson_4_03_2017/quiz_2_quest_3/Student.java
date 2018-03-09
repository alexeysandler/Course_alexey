package lesson_4_03_2017.quiz_2_quest_3;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    Map<Course,Integer> mapCourses = new HashMap<>();


    public Student(String name, long id, String email) {
        super(name, id, email);
    }
}
