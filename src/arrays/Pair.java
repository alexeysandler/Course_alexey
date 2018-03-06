package arrays;

public class Pair {
    private int num1;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getMax() {
        return num1 > num2 ? num1 : num2;
    }
    public int getSum(){
        return num1 + num2;
    }

    public void printSum(){
        System.out.println(getSum());
    }


    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
