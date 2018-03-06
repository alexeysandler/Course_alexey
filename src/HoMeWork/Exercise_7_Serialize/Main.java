package HoMeWork.Exercise_7_Serialize;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Point p = new Point(5,3);
        Point pR = new Point(3,4);
        Rectangle rec1 = new Rectangle(p,pR);
        Circle circle = new Circle(p,3);
        ArrayList<Shape> list = new ArrayList<>();
        list.add(rec1);
        list.add(circle);

        writeObjToFile(list);
        readObjFromFile();


    }

    private static void readObjFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            ArrayList<Shape> listFromFile = (ArrayList<Shape>)objectInputStream.readObject();
            for(Shape shape : listFromFile){
                System.out.println(shape1);
            }
        }
    }

    private static void writeObjToFile(ArrayList<Shape> list) throws IOException{

        try (FileOutputStream outputStreamStream = new FileOutputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStreamStream);){
            objectOutputStream.writeObject(list);
        }
    }
}
