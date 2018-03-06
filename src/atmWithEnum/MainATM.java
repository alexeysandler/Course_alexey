package atmWithEnum;

public class MainATM {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.add(Bill._50, 300);
		atm.add(Bill._100, 0);
		System.out.println(atm.calTotal());

	}

	
}
