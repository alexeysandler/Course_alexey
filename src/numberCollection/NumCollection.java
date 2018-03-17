package numberCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumCollection implements Iterable<Integer> {
	private String num;
	private int singleNum;
	private boolean isSingleNum;
	private List<Integer> numbers = new ArrayList<>();
	private String[] strArr;

	public NumCollection(String num) throws UnsortedValuesException {
		this.num = num;		
		calcnum();

	}

	public void calcnum() throws UnsortedValuesException {
		if (!num.contains(",")) {
			    if (!num.contains("-")) {
				  //one positive number				
				   parseOneNum(num);
		    	} 
				//one  negative number
			    else if(num.startsWith("-") && (!num.substring(1).contains("-"))){					
						parseOneNum(num);										
				}
				// one range negative-from negative to negative
				else if(num.startsWith("-") && num.contains("--")){
					isSingleNum = false;
					addToList(num);	
     			    					
				}
			    //one range negative from negative to positive
				else if(num.startsWith("-")&&num.substring(1).contains("-")){
					isSingleNum = false;
					addToList(num);
				}
			    //one range positive
				else if(num.contains("-")){
					isSingleNum = false;
					addToList(num);					
			   }
	    }
		else{
			//list of nums only with ,
			if(num.contains(",")&&!num.contains("-")){
				isSingleNum = false;
				strArr=num.split(",");
				copyToList(strArr);
				
			}
			//list and range 
			else if(num.contains(",") && num.contains("-")){
				isSingleNum = false;
				strArr=num.split(",");
				copyToList(strArr);
			}
			
		}

		
	}
		
		private void copyToList(String[] strArr2) throws UnsortedValuesException {
		for(String str : strArr2){
			if(str.contains("-")){
				addToList(str);	
			}else{
				try{
					int number = Integer.parseInt(str);
					numbers.add(number);
				}
				catch(NumberFormatException e){
					System.out.println("Parsing from String to int failed");
				}
			}
		
			for(int i=0;i<numbers.size()-1;i++){
				if(numbers.get(i)>numbers.get(i+1)){
					throw new UnsortedValuesException();
				}
				
			}
		}
		
	}

		private void addToList(String num) throws UnsortedValuesException {
			if(num.contains("--")){
				int index = num.indexOf("--");
				try{
					 int start = Integer.parseInt(num.substring(0, index));
					 int end = Integer.parseInt(num.substring(index+1));
					for (int i = start; i <= end; i++)
						numbers.add(i);
				}   catch (NumberFormatException e) {    
					System.out.println("Parsing from String to int failed");
				}	
				
			}
			else if(!num.startsWith("-")){
				int index = num.indexOf("-");
				try{
					 int start = Integer.parseInt(num.substring(0, index));
					 int end = Integer.parseInt(num.substring(index+1));
					 if(start>end){
						 throw new UnsortedValuesException();
					 }
					for (int i = start; i <= end; i++)
						numbers.add(i);
				}   catch (NumberFormatException e) {    
					System.out.println("Parsing from String to int failed");
				}	
				
			}
			else if(num.startsWith("-")&&num.substring(1).contains("-")){
				String sub=num.substring(1);
				int index =sub.indexOf("-");
				try{
					int start = Integer.parseInt(num.substring(0, 2));
					int end = Integer.parseInt(sub.substring(index+1));
					for (int i = start; i <= end; i++)
						numbers.add(i);
				}  catch (NumberFormatException e) {    
					System.out.println("Parsing from String to int failed");
				}	
				
			}
		}

	private void parseOneNum(String str) {
		try{
			singleNum = Integer.parseInt(num);
			isSingleNum = true;
		}
		catch(NumberFormatException e){
			System.out.println("Parsing from String to int failed");
		}
		
	}



	public boolean contains(int number) {
		if (isSingleNum == true) {
			return singleNum == number;
		} else {
			return numbers.contains(number);

		}
	}

	@Override
	public Iterator<Integer> iterator() {
		
		return numbers.iterator();
	}

}
