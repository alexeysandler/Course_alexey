
public class ContainsJava {


    public static void main(String [] args) {
        float sum=0;
        float count=1;
        int inputInt;
        float averageOut=0;

        for (String str:args){
            try {
                inputInt=Integer.parseInt(str);
                sum=sum+inputInt;
                averageOut=sum/count;
                count++;

            } catch (NumberFormatException e) {
                System.out.println("The string can not be converted to integer ..");
            }
        }
        System.out.println(averageOut);
    }
}
