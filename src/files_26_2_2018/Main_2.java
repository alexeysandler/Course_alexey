package files_26_2_2018;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Map<Character,Integer> frequencies = new HashMap<>();
        Scanner sc = new Scanner(System.in);

       // while ( sc.hasNext()){

            File file = new File(sc.next());

            try {
                FileInputStream stream = new FileInputStream(file.getAbsolutePath());
                try {
                int i = 0;
                while((i=stream.read())!=-1){

                    Integer curr = frequencies.get((char)i);
                    if(curr == null){
                        curr = 0;}
                    frequencies.put((char)i,curr+1 );
                    }

                    stream.close();
                    File fileOut = new File(sc.next());
                    BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut.getAbsolutePath()));

                    for (Map.Entry<Character,Integer> entry : frequencies.entrySet()){
                        bw.write(entry.getKey());
                        bw.write(entry.getValue());
                    }

                }catch (IOException e){

                }

            }catch (FileNotFoundException e){

            }
        }

    }



