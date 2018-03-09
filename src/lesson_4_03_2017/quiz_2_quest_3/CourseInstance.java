package lesson_4_03_2017.quiz_2_quest_3;

import java.util.ArrayList;

public class CourseInstance extends Course {
    private Course course;
    private int year;
    private Teacher teacher;
    ArrayList<Student> students;
    private Terms term;

    public CourseInstance(Course course,int year, Teacher teacher,Terms term,ArrayList<Student> students) {
        super(course);
        this.year = year;
        this.teacher = teacher;
        this.term = term;
        this.students = students ;
    }

    }


