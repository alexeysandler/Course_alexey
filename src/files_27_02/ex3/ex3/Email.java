package files_27_02.ex3.ex3;

public class Email {
	
	private static String emailS;
	private static String subjectS;
	private static String messageS;
	
	public static void sendMail(String email,String subject,String message){
		emailS=email;
		subjectS = subject;
		messageS = message;
		
	}

}
