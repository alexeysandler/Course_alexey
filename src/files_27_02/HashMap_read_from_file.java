package files_27_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class HashMap_read_from_file {
    public static void main(String[] args) throws IOException{

        FileInputStream inputStream = new FileInputStream(("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey"));
        ObjectInputStream inputObject = new ObjectInputStream(inputStream);
        try {
           HashMap<String,Integer> myMap =(HashMap<String, Integer>) inputObject.readObject();
           for(Map.Entry<String,Integer> entry : myMap.entrySet()){
               System.out.println(entry.getKey()+" "+ entry.getValue());
           }
        } catch (ClassNotFoundException e) {}
        finally {
            inputObject.close();
            inputStream.close();
        }
    }
}
