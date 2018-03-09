package files_27_02.ex3.ex3;

public enum Term {
	A("A"), B("B"), C("C");

	private String semester;

	private Term(String semester) {
		this.semester = semester;

	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

}
