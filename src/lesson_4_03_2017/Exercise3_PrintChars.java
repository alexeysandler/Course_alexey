package lesson_4_03_2017;

import java.io.FileInputStream;
import java.io.IOException;

public class Exercise3_PrintChars  {
    static int number;
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey.txt");){
            printChars(fileInputStream);
        }
        
    }

    private static void printChars(FileInputStream fileInputStream) throws IOException {
        number=fileInputStream.read();
        if(number == -1){
            return;
        }else{
            System.out.println((char)number);
            printChars(fileInputStream);
        }

    }
}
