package lesson_4_03_2017.books_before_quize_2;

import java.util.Date;
import java.util.Map;

public class Borrower extends Person{

    Map<BookInstance,Date> borowerBookMap;
    Date date;

    public Borrower(String name, int id) {
        super(name, id);
    }

    public Borrower(Person alexey) {
        super(alexey.getName(), alexey.getId());
    }

        public void borrowTheBook(BookInstance bookInstance){
        borowerBookMap.put(bookInstance, date=new Date());
        }

        public int getAmountBorrowedBooks(){
        return borowerBookMap.size();

        }
}
