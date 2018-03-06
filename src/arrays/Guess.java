package arrays;

public class Guess {
    public static int numOfGuesses;


    public static String isBellowOrUpper;

    public static boolean isRightNumber(int num, int userChoice) {
        numOfGuesses++;
        if(num == userChoice){
            return true;
        }else{
            isBellowOrUpperFunc(num,userChoice);
            return false;
        }
    }

    private static void isBellowOrUpperFunc(int num, int userChoice) {
        if(num > userChoice){
            isBellowOrUpper = "Your choice below the guess.";
        }else {
            isBellowOrUpper = "Your choice is above the guess.";
        }
    }
}
