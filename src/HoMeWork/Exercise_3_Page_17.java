package HoMeWork;

import java.io.*;

public class Exercise_3_Page_17
{
    public static void main(String[] args) throws IOException{
    String strIn = "C:\\Users\\alexey-pc\\IdeaProjects\\MyFirstProject\\input.txt";
    String codeIn = "UTF-8";
        String strOut = "C:\\Users\\alexey-pc\\IdeaProjects\\MyFirstProject\\output.txt";
        String codeOut = "UTF-8";

        try (BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream(strIn),codeIn));
             BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(strOut),codeOut))){
            String line;
            while(( line = bufferedReader.readLine())!= null){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
            }
        }



    }
}
