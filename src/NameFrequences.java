import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameFrequences {
    public static void main(String[] args) {
        Map <String,Integer>nameMap = new HashMap();
        int frequency;
        for(String name : args){
            if(!nameMap.containsKey(name)){
              nameMap.put(name,1);
            }
            else{
                frequency =  nameMap.get(name);
                frequency++;
                nameMap.put(name,frequency);
            }
        }
            // Get a set of the entries
            Set set = nameMap.entrySet();
            // Get an iterator
            Iterator myIterator = set.iterator();

            // Display elements
            while(myIterator.hasNext()) {
                Map.Entry me = (Map.Entry)myIterator.next();
                System.out.print(me.getKey() + " ");
                printDash(me.getValue());
                System.out.println();
            }

        }

    private static void printDash(Object value) {
        for(int i = 0; i<Integer.valueOf((Integer) value); i++) {

            System.out.print('#');
        }
    }
}


