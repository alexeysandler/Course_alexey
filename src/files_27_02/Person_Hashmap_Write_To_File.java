package files_27_02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Person_Hashmap_Write_To_File {
    public static void main(String[] args) throws IOException{
        Map<Person,Integer> persons = new HashMap<>();
        Person p1 = new Person("Alexey");
        Person p2 = new Person("Kobby");
        Person p3 = new Person("Anna");
        Person p4 = new Person("Lea");
        persons.put(p1, 5);
        persons.put(p2, 1);
        persons.put(p3, 4);
        persons.put(p4, 2);
        FileOutputStream inFile = new FileOutputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey");
        ObjectOutputStream inputStreamObject = new ObjectOutputStream(inFile);
        try{
            inputStreamObject.writeObject(persons);
        }catch(IOException e){}
        finally {
            inputStreamObject.close();
        }
    }
}
