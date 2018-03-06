package expression;

public class Number implements Expression{
    @Override
    public String toString() {
        return "Number{" +
                "n1=" + n1 +
                '}';
    }

    private double n1;

    public Number(double n1) {
        this.n1 = n1;
    }

    @Override
    public double evaluate() {
        return n1;
    }
}
