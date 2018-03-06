package iterator;

public class Main {
    public static void main(String[] args) {
        MyString s = new MyString("Hello");
        for (char c : s){
            System.out.println(c);
        }
    }
}
