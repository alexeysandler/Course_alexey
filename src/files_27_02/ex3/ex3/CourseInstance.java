package files_27_02.ex3.ex3;

import java.util.List;

public class CourseInstance {
	private Course course;
	private int year;
	private Term term;
	private Teacher teacher;
	private List<Student> students;

	public CourseInstance(Course course, int year, Term term, Teacher teacher, List<Student> students) {

		this.course = course;
		this.year = year;
		this.term = term;
		this.teacher = teacher;
		this.students = students;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Term getTerm() {
		return term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "CourseInstance [course=" + course + ", year=" + year + ", term=" + term + ", teacher=" + teacher
				+ ", students=" + students + "]";
	}

}
