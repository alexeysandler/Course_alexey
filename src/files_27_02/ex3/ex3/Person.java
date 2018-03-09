package files_27_02.ex3.ex3;

public class Person {

	private String name;
	private long id;
	private String email;

	public Person(String name, long id, String email) {

		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

}
