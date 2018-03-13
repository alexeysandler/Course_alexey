package lesson_4_03_2017.books_before_quize_2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Borrower extends Person{

     Map<BookInstance,Date> borrowedBooksByDateMap = new HashMap<>();
    static Map<Long,String> addedBorrowers = new HashMap<>();

    public Borrower(String name, Long id) {
        super(name, id);
    }


    public int getNumOfTheBooksPerBorrower() {
        return borrowedBooksByDateMap.size();
    }



    public void addBookInstanceToBorower(BookInstance bookInstance){
        borrowedBooksByDateMap.put(bookInstance, new Date());
    }


    public Borrower(Person person) {
        super(person.getName(), person.getId());
        addedBorrowers.put(person.getId(), person.getName());

    }


}
