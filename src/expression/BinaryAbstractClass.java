package expression;

public abstract class BinaryAbstractClass implements Expression{
    public Expression e1;
    public Expression e2;



    public BinaryAbstractClass(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    @Override
    public double evaluate() {
        return calculate(e1.evaluate(),e2.evaluate());

    }
    public abstract double calculate(double a, double b);
}
