package lesson_4_03_2017.books_before_quize_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Book, ArrayList<BookInstance>> books;
    private Map<Long, ArrayList<BookInstance>> borrowersIdToBooksMap = new HashMap<>() ;
    private Map<Borrower, BookInstance> booksPerBorrower = new HashMap<>();

    public void addBookToBorrower(Borrower borrower, BookInstance bookInstance) {
        booksPerBorrower.put(borrower, bookInstance);
        borrower.addBookInstanceToBorower(bookInstance);
    }

    public void printBorrowerAndBooks(){
        ApplyOnBorrower apply = new PrintAction();
        forAllBorrowers(apply);
    }

    public void forAllBorrowers(ApplyOnBorrower apply){
            for (Borrower borrower : booksPerBorrower.keySet()){
                apply.applyFunction(borrower);
        }
    }

    public void printBorrowerWithSpecificAmount() {

        forAllBorrowers(new ApplyOnBorrower() {
            @Override
            public void applyFunction(Borrower b) {
                int maxBooksAmount = 3;
                if (b.getNumOfTheBooksPerBorrower()> maxBooksAmount){
                    System.out.println(b.getName());
                }
            }
        });

    }
}
