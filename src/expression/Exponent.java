package expression;

public class Exponent extends BinaryAbstractClass  {

    public Exponent(Expression e1, Expression e2){
        super(e1,e2);
    }
    @Override
    public String toString() {
        return "Exponent{" +
                "e1=" + e1 +
                ", e2=" + e2 +
                '}';
    }

    @Override
    public double calculate(double a,double b) {
        return Math.pow(a,b);
    }
}
