package files_27_02;

import java.io.*;

public class Main_3 {
//TO DO AT HOME
    public static void readTheData()throws IOException{
        DataInputStream input = new DataInputStream(new FileInputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey"));
        try {
            System.out.println(input.readInt());
        }catch (IOException e){}
        finally {
            input.close();
        }
    }

    public static void main(String[] args) throws IOException {
        createFileForReading();
        readTheData();
    }

    private static void createFileForReading() throws IOException {
        DataOutputStream outS  = new DataOutputStream(new FileOutputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\InAlexey"));
        try {
            int[] array_1 = new int[]{2, 5, 7, 9};
            for(int i : array_1){
                outS.writeInt(i);
            }
        }catch (IOException e){}
        finally {
            outS.close();
        }
    }
}
