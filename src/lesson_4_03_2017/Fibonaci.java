package lesson_4_03_2017;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    private static int fibonacci(int i) {
        if (i == 1 || i ==0){
            return 1;
        }else {
           return (fibonacci(i - 1)+ fibonacci(i - 2));
        }
    }


}
