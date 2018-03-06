public class PrimeNumber {
    public static void main(String []args){
    int [] numbers = {9,-1,0,6,7,25,17};
    for(int testNumber : numbers){
        try {
            if(isPrime(testNumber)) {
                System.out.println("The " + testNumber + " is primary !!!");
            }else {
                System.out.println("The " + testNumber + " is NOT primary !!!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }


        public static boolean isPrime(int n) throws IllegalArgumentException{
        if (n < 1){
            throw new IllegalArgumentException("The prime number should be greater then 1");
        }
                //check if n is a multiple of 2
                if (n%2==0) return false;
                //if not, then just check the odds
                for(int i=3;i*i<=n;i+=2) {
                    if(n%i==0)
                        return false;
                }
                return true;
            }
    }


