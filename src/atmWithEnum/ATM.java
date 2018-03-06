package atmWithEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ATM {
	
private Map<Bill,Integer> bills2amount = new HashMap<>();
private static Map<Bill,Integer> billTotal = new HashMap<>();

public void add (Bill bill, int amount) {
	Integer currAmount = bills2amount.getOrDefault(bill, 0);
	bills2amount.put(bill, currAmount+amount);
  }	

public Map<Bill,Integer> calTotal(){
	for(Entry<Bill, Integer> curr : bills2amount.entrySet()) {
		
	int value= curr.getKey().getMonetaryValue(); 
    int amount = curr.getValue(); 
	int  total = value*amount;
  	
	billTotal.put(curr.getKey(), total );
 }
	return billTotal;
  }    
}