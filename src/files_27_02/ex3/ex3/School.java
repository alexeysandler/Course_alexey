package files_27_02.ex3.ex3;

import java.util.List;

public class School {

	private List<Course> courses;
	private List<CourseInstance> courseInstances;
	private List<Student> students;
	private List<Teacher> teachers;

	public School(List<Course> courses, List<CourseInstance> courseInstances, List<Student> students,
			List<Teacher> teachers) {

		this.courses = courses;
		this.courseInstances = courseInstances;
		this.students = students;
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "School [courses=" + courses + ", courseInstances=" + courseInstances + ", students=" + students
				+ ", teachers=" + teachers + "]";
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<CourseInstance> getCourseInstances() {
		return courseInstances;
	}

	public void setCourseInstances(List<CourseInstance> courseInstances) {
		this.courseInstances = courseInstances;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void forAllStudentsInCourse(CourseInstance course, ApplyOnStudent apply) {
		List<Student> students = course.getStudents();
		for (Student s : students) {
			apply.applyFunction(s);

		}

	}

}
