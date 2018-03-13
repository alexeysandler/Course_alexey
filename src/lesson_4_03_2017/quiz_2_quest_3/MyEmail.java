package lesson_4_03_2017.quiz_2_quest_3;

public class MyEmail  {

    private static String subj;
    private static String message;
   private String email;


    public static void sendMail(String email, String subj, String message){
        System.out.println(email +" " +subj+" "+ message);
    }

}
