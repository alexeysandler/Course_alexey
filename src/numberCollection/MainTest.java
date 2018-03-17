package numberCollection;

public class MainTest {

	public static void main(String[] args) throws UnsortedValuesException {
		NumCollection nc = new NumCollection("5-10");
		//nc.testcalcnum("5-99");
		for(int i : nc){
			System.out.println(i);
		}

	}

}
