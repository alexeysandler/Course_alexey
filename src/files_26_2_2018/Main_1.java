package files_26_2_2018;

import java.io.FileInputStream;
import java.io.IOException;

public class Main_1 {
    public static void main(String[] args) {
        try {
        FileInputStream stream = new FileInputStream("C:\\Users\\a.txt");
        int i =0;
        while((i=stream.read())!= -1) {
            System.out.println((char)i);

        }
        stream.close();
        }catch (IOException e){
            // eee
        }

    }
}
