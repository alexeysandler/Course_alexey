package lesson_4_03_2017.quiz_2_quest_3;

import java.util.ArrayList;
import java.util.List;

public class School  {
    List<Course> courses = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<CourseInstance> courseInstances ;

    public School(List<Course> courses, List<Student> students, List<Teacher> teachers, List<CourseInstance> courseInstances) {
        this.courses = courses;
        this.students = students;
        this.teachers = teachers;
        this.courseInstances = courseInstances;
    }



    public void forAllStudentsInCourse(CourseInstance courseInstance, ApplyOnStudent apply){
    List <Student> students = courseInstance.students;
    for (Student s : students){
        apply.applyFunction(s);

    }
    }
    public void sendEmailToStudentInCourse(CourseInstance courseInstance, String subject, String message) {

        ApplyOnStudent applyOnStudent = new SendEmail(subject, message);
        forAllStudentsInCourse(courseInstance,applyOnStudent );

    }

}
