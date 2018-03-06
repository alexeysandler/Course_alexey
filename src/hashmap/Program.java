package hash;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        ArrayList<HashMap<String, Integer>> myList = new ArrayList();
        HashMap<String, Integer> firstHashMap = new HashMap<>();
        HashMap<String, Integer> secondHashMap = new HashMap<>();
        HashMap<String, Integer> thirdHashMap = new HashMap<>();
        firstHashMap.put("Alex", 5);
        firstHashMap.put("Lior", 2);
        secondHashMap.put("Lior", 1);
        thirdHashMap.put("Lior", 4);
        thirdHashMap.put("Alex", 2);
        thirdHashMap.put("Anna", 4);
        myList.add(firstHashMap);
        myList.add(secondHashMap);
        myList.add(thirdHashMap);
        aggregate(myList);
        System.out.println(aggregate(myList));
    }

    private static HashMap aggregate(ArrayList<HashMap<String, Integer>> myList) {
        HashMap<Object, Object> myReturnedHashMap = new HashMap<>();

        for (HashMap<String, Integer> myHashMap : myList) {
            Iterator it = myHashMap.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)it.next();
                if(!myReturnedHashMap.containsKey(pair.getKey())){
                    myReturnedHashMap.put(pair.getKey(),pair.getValue());
                }else {
                    int oldValue = (int) myReturnedHashMap.get(pair.getKey());
                    int frequency  = myHashMap.get(pair.getKey())+oldValue;

                    myReturnedHashMap.put(pair.getKey(),frequency);
                }
            }
        }
        return myReturnedHashMap;
    }

}



