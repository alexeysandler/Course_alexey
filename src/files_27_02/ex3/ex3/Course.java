package files_27_02.ex3.ex3;

public class Course {
	private String name;
	private int number;

	public Course(String name, int number) {

		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Course) && ((Course) obj).name.equals(this.name);

	}

}
