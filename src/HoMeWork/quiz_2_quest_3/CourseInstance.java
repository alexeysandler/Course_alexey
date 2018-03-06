package HoMeWork.quiz_2_quest_3;

import java.util.ArrayList;

public class CourseInstance extends Course {
    private Course course;
    private int year;
    private Teacher teacher;
    ArrayList<Student> students;
    private Terms term;

    public CourseInstance(String name, int number) {
        super(name, number);
    }
}
