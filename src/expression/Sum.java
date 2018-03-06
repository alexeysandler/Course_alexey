package expression;

public class Sum extends BinaryAbstractClass  {


    public Sum(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public String toString() {
        return "Sum{" +
                "e1=" + e1 +
                ", e2=" + e2 +
                '}';
    }
    @Override
    public double calculate(double a,double b) {
        return a+b;
    }




}
