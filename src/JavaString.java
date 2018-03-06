public class JavaString {

    String [] myStr = {"1Java","javax","java"};

    public static void main(String [] args) {

        for(String javaString:args){
            if(javaString.contains("Java")) {
                System.out.println(javaString);
            }
        }
    }
}
