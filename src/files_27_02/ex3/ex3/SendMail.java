package files_27_02.ex3.ex3;

public class SendMail implements ApplyOnStudent {
	private String subject;
	private String message;
	
	
	

	public SendMail(String subject, String message) {
		
		this.subject = subject;
		this.message = message;
	}
 



	@Override
	public void applyFunction(Student s) {
		
		Email.sendMail(s.getEmail(), this.subject, this.message);
		System.out.printf("%s %s %s", s.getEmail(), this.subject, this.message);
		System.out.println();
		
	}
	
	
	
	

}
