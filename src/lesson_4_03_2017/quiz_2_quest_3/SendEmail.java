package lesson_4_03_2017.quiz_2_quest_3;

public class SendEmail implements ApplyOnStudent {
    private String subject;
    private String message;

    public SendEmail(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    @Override
    public void applyFunction(Student student) {
        MyEmail.sendMail(student.getEmail(),this.subject, this.message);

    }
}
