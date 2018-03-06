package HoMeWork.quiz_2_quest_3;

public class SendEmail implements ApplyOnStudent {

    private String subj;
    private String message;


    @Override
    public void applyFunction(Student student) {

        Email.sendEmail(student.getEmail(),  subj,  message);
    }
}
