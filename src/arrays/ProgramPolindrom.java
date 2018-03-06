package arrays;

public class ProgramPolindrom {
    public static void main(String[] args) {
        int[] myArray= retArray(args);
        System.out.println(isPolindrom(myArray));
        printArr(myArray);
    }

    private static boolean isPolindrom(int[] argsArr) {
        int i=0;
        int j=argsArr.length-1;
        boolean flag = true;
        while (i<j){
            int iarr=argsArr[i];
            int jarr=argsArr[j];
            if (argsArr[i]!=argsArr[j]){
                return flag=false;
            }else{
                i++; j--;
            }
        }
        return flag;
    }

    protected static void printArr(int[] ints) {
        for (int value:ints) {
            System.out.print(value+" ");
        }
    }


    protected static int[] retArray(String[] args) {
        int [] newArray= new int [args.length];
        for (int i=0;i < args.length; i++){
            newArray[i] = Integer.parseInt(args[i]);
        }
        return newArray;
    }
}
