package HoMeWork;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_2_Page_16 {
    public static HashMap<Character, Integer> letterCount = new HashMap();
    public static HashMap<String, Integer> wordCount = new HashMap();

    public static void main(String[] args) throws IOException {
       // String input = "C:\\Users\\alexey-pc\\IdeaProjects\\MyFirstProject\\input.txt";
        // String output = "C:\\Users\\alexey-pc\\IdeaProjects\\MyFirstProject\\output.txt";

        //reader = new BufferedReader(new InputStreamReader(new FileInputStream("test2.txt"), "UTF-"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");

            String input = sc.next();
            String output = sc.next();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF-8"));) {
            // The BufferedReader reads the lines
            String line=null;
            while ((line = br.readLine()) != null) {
                if(line.length() !=0) {
                    // Split the line into a String array to loop through
                    String[] words = line.split(" ");
                    for (String str : words) {
                        countLetters(str);
                    }
                    insertWordInMap(words);
                    printWordFreqs(output);

                }
            }
        }
    }

    private static void printLetterFreqs(String output, PrintWriter printWriter) {
        printWriter.println("The frequency of the letters is:");
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            printWriter.println(entry.getKey() + " # " + entry.getValue());
        }
    }

    private static void printWordFreqs(String output) throws IOException {

        try (PrintWriter printWriter = new PrintWriter(output, "UTF-8");) {
            printWriter.println("The frequency of the words is:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                printWriter.println(entry.getKey() + " # " + entry.getValue());
            }
            printWriter.println("************************************************");
            printWriter.println("");
            printLetterFreqs(output,printWriter);
        }
    }

    private static void countLetters(String str) {
        for (int i=0; i< str.length(); i++){
            Character c= str.charAt(i);
            Integer current = letterCount.getOrDefault(c,0);
            letterCount.put(c, current+1);
        }
    }

    private static void insertWordInMap(String[] words) {


        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            System.out.println(words[i]);
            Integer current = wordCount.getOrDefault(word,0);
            wordCount.put(word, current+1);

        }
    }
}
