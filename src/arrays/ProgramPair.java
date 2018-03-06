package arrays;

public class ProgramPair {
    public static Pair [] pairArray = new Pair[3];
    public static int arrPointer =0;

    public static void main(String[] args) {
        Pair myPair1 = new Pair(2,3);
        Pair myPair2 = new Pair(3,1);
        int max = myPair1.getMax();
        System.out.println("The max is " + max);
        int sum = myPair1.getSum();
        myPair1.printSum();
        System.out.println("sum is "+ sum);

        int max2 = myPair2.getMax();
        System.out.println("The max is " + max2);
        int sum2 = myPair2.getSum();
        myPair2.printSum();
        System.out.println("sum is "+ sum2);

        add(myPair1);
        add(myPair2);

    }
    public static void add(Pair pair){
        pairArray[arrPointer] = pair;
        arrPointer++;
    }
}
