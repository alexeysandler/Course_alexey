package files_27_02;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainDATA {
    public static void main(String[] args) throws IOException {
        DataOutputStream outS  = new DataOutputStream(new FileOutputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey"));
      //  int[] array_1 = new int[]{2, 5, 7, 9};
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                outS.write(sc.nextInt());
            }
        }catch (IOException e){}
        finally {
            outS.close();
        }

    }
}
