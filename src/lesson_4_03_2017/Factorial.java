package lesson_4_03_2017;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }

    private static int calcFactorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * calcFactorial(i - 1);
        }


    }
}
