package lesson_4_03_2017.quiz_2_quest_3;

import java.util.ArrayList;
import java.util.List;

public class MainStudentsEmail {
    public static void main(String[] args) {
        Student student1 = new Student("alex",123,"a@a.com");
        Student student2 =new Student("bobo",456,"b@b.com");
        Student student3 = new Student("gogo",789,"g@g.com");

        ArrayList <Student>students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Course englishCourse = new Course("english", 2);
        Course javaCourse = new Course("java", 3);

        List<Course> courses = new ArrayList<>();
        courses.add(englishCourse);
        courses.add(javaCourse);

        Teacher teacher1 = new Teacher("Amir",111,"amir@s.com");
        Teacher teacher2 = new Teacher("Aviad",222,"aviad@s.com");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        CourseInstance courseInstance1 = new CourseInstance(englishCourse,1977, teacher2, Terms._semestr_A, students);
        CourseInstance courseInstance2 = new CourseInstance(javaCourse,1966,teacher1, Terms._semestr_B, students);
        List<CourseInstance> courseInstances = new ArrayList<>();
        courseInstances.add(courseInstance1);
        courseInstances.add(courseInstance2);

        MyEmail sendEmail = new MyEmail();
        School school = new School(courses,students,teachers,courseInstances);
       // school.forAllStudentsInCourse(courseInstance1,sendEmail);
        school.sendEmailToStudentInCourse(courseInstance1,"No course tomorow " , "Congratsssssssssssssssss!!!!!!!!");
    }

}
