package parametrized_13_03_2018;

public  class Factorial1 {

    public static int calcFactorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * calcFactorial(i - 1);
        }


    }
}
