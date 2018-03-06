
public class FrequencyOfLetters {

    public static void main(String[] args) {
        String receivedString = args[0];

        int []arrayASCIvaluesOfLetters = new int[256];
        char myChar;

        // Count frequency of every character and store
        // it in counter array on asci value cell
        for (int i = 0; i < receivedString.length(); i++) {

            arrayASCIvaluesOfLetters[(int) Character.toUpperCase(receivedString.charAt(i))]++;
        }
        // Print Frequency of characters
        for (int i = 0; i < 256; i++) {
            if (arrayASCIvaluesOfLetters[i] != 0 ) {
                myChar=Character.toUpperCase((char) i);
                //Check and print the Capital letters only
                if((int)myChar>64 && (int)myChar<91) {
                    System.out.print(myChar + " --> ");
                    printSulamit(arrayASCIvaluesOfLetters[i]);
                    System.out.println();
                }
            }
        }
    }

    private static void printSulamit(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print('#');
        }
    }
}