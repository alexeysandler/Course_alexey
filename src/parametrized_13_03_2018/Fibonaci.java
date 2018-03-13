package parametrized_13_03_2018;

public class Fibonaci {

    public static int fibonacci(int i) {
        if (i == 1 || i ==0){
            return 1;
        }else {
            return (fibonacci(i - 1)+ fibonacci(i - 2));
        }
    }


}