public class PowClass {

    public static void main(String [] args){
        double [][] powNumbersArray = {{4,0},{0,-0.5},{3,4},{0,0},{-2,0.2},{5,2}};

        for (double [] numbers:powNumbersArray){
            double num = 0;
            try {
                num = myCalcPow(numbers[0], numbers[1]);
                System.out.println(numbers[0]+" Pow " + numbers[1] +" = "+num);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());             }
        }
    }

    private static double myCalcPow(double number, double number1)throws ArithmeticException {
        Double doubleObj=null;
        double retPow =0;
         if(number==0 && number1==0){
            throw new ArithmeticException("Zero can't be a pow of zero");
        }

        retPow= Math.pow(number,number1);
         if (Double.isInfinite(retPow)){
             throw new ArithmeticException("Can't calculate pow of Infinity");
         }
        doubleObj= Math.pow(number,number1);
        if (Double.isNaN(retPow)){
            throw new ArithmeticException("Can't calculate pow of Nan");
        }
         retPow=doubleObj;
         return retPow;
    }
}
