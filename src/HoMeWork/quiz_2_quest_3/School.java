package HoMeWork.quiz_2_quest_3;

import java.util.ArrayList;
import java.util.List;

public class School implements ApplyOnStudent{
    List<Course> courses = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<CourseInstance> courseInstances ;

    @Override
    public void applyFunction(Student student) {

    }
    public void forAllStudentsInCourse(CourseInstance instance, ApplyOnStudent apply){

    }
    public void sendEmailToStudentCourse(CourseInstance courseInstance, String subject, String message){

    }
}
