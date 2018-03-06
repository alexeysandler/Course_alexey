package arrays;

import static arrays.ProgramPolindrom.printArr;

public class ProgramCountDigits {
    public static void main(String[] args) {
        int[] myArray= ProgramPolindrom.retArray(args);
        int summer = returnSum(myArray);
        int numOfDigits = returnSumOfDigits(myArray);
        System.out.println("the summer is "+summer);
        System.out.println("the digits count is "+numOfDigits);
        printArr(myArray);

    }

    private static int returnSumOfDigits(int[] myArray) {
        int counter=0;
        for (int num : myArray){
            counter = counter + numOfDigitsInNumber(num);
        }
        return counter;
    }

    private static int numOfDigitsInNumber(int num) {
        int number=0;
        while(num > 0){
            num = num / 10;
            number++;
        }
        return number;
    }

    private static int returnSum(int[] myArray) {
        int sum=0;
        for (int num : myArray){
            sum = sum + num;
        }
        return sum;
    }
}
