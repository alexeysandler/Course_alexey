package arrays;

import java.util.Random;
import java.util.Scanner;

public class ProgramGuessTheNumber {
    public static void main(String[] args) {
        int num = generateTheNumber(1, 100);
        System.out.println(num);
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        while(sc.nextInt()!= -99){
            boolean theChoice =  Guess.isRightNumber(num, userChoice);
            if (theChoice){
                System.out.println("Correct, the number of guesses is " + Guess.numOfGuesses);
                break;
            }else{
                System.out.println("Incorrect, " + Guess.isBellowOrUpper );
                break;
            }
        }
    }

    private static int generateTheNumber(int min, int max) {
        Random random = new Random();
        return  random.nextInt(max -min+1) + min;
    }
}
