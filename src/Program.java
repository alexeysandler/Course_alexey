public class Program {

    public static void main(String [] args){

    int i = 3;
    foo(i);
        System.out.println(i);

        Integer i2=7;
        foo(i2);
        System.out.println(i2);
    }

    private static void foo(int i) {
        i=5;
    }
    private static void foo(Integer i){

        i=7;
    }
}
