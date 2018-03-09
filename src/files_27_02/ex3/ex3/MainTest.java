package files_27_02.ex3.ex3;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		
		Course course1= new Course("java1",1);
		Course course2= new Course("math1",2);
		Course course3= new Course("java2",3);
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		Student s1 = new Student("Avi",23456,"avi@gmail.com");
		Student s2 = new Student("Haim",123321,"haim@gmail.com");
		Student s3 = new Student("Lior",223344,"lior@gmail.com");
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Teacher t1 = new Teacher("Ram",334455,"ram@gmail.com");
		Teacher t2 = new Teacher("Ran",556677,"ran@gmail.com");
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
        CourseInstance courseInst1 = new CourseInstance(course1,2018,Term.A,t1,students);
        CourseInstance courseInst2 = new CourseInstance(course2,2018,Term.A,t1,students);
        CourseInstance courseInst3 = new CourseInstance(course3,2018,Term.A,t1,students);
        List<CourseInstance> courseInstances = new ArrayList<>();
        courseInstances.add(courseInst1);
        courseInstances.add(courseInst2);
        courseInstances.add(courseInst3);
        SendMail sendMail = new SendMail("The class is dissmissed" , "The class in course java is dismmised for this week ");
        
        School school = new School(courses,courseInstances,students,teachers);
        //System.out.println(school);
        school.forAllStudentsInCourse(courseInst1, sendMail);
       
	}

}
