package files_27_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class Person_Hashmap_Read_From_File {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //try with resources
        try (FileInputStream inputStreamFile = new FileInputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStreamFile)) {
            HashMap<Person, Integer> readObject = (HashMap<Person, Integer>) objectInputStream.readObject();
            for (Map.Entry<Person, Integer> entry : readObject.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException | ClassNotFoundException e) {
            throw e;

        }
    }
}
