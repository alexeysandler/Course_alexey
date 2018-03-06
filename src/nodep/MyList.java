package nodep;

public class MyList {
        Node first;
        private int size;
        public void add (int number){
        if (first == null){
            first=new Node(number);
        }else{
            Node current = first;
           while(current.getNext()!=null){
               current=current.getNext();
           }
           current.setNext(new Node(number));
           size++;
        }

    }

    public String toString(){
            String numbers="";
            Node current = first;
            while(current.getNext()!=null){
                numbers=numbers +" " + current.getNumber();
                current=current.getNext();
            }

            return numbers;
    }

}
