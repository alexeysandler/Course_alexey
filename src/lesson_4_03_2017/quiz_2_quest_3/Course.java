package lesson_4_03_2017.quiz_2_quest_3;

public class Course {
    private String name;
    private int number;

    public Course(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Course(Course course) {
        this.name = course.getName();
        this.number = course.getNumber();
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
}
