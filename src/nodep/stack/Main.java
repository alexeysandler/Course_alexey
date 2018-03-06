package nodep.stack;

public class Main {
    public static void main(String[] args) {

        MyStack st = new MyStack(3);


        try {
            st.push(5);
            st.push(7);
            st.push(11);
            st.push(333);
            System.out.println(st.pop());
            int i = st.pop();
            System.out.println(i);
            System.out.println(st.pop());
            st.push(37);
            //  st.push(55);
            System.out.println(st.pop());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e.getMessage());
        }


    }
}
