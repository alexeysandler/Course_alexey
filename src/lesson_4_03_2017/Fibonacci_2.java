package lesson_4_03_2017;

public class Fibonacci_2{
    public static void main(String[] args) {
        System.out.println( fibonacci(6));
    }

        private static int fibonacci(int i) {
        return fibonacci2(i)[1];
        }


        private static int[] fibonacci2(int i) {
    if(i <=1) {
        return new int[]{1, 1};
    }
             int [] arr = fibonacci2(i-1);
    return new int[] {arr[1],arr[0]+arr[1]};

        }
}
