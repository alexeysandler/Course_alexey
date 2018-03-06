package expression;

public class Main {
    public static void main(String[] args) {
        Expression e =
                new Sum(
                        new Exponent(new Number(2.0), new Number(3.0)),
                        new Sum(new Number(1.0), new Number(-3.0)));
        System.out.println(e + " = " + e.evaluate());

    }
}
