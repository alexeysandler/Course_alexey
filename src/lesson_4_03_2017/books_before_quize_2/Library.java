package lesson_4_03_2017.books_before_quize_2;

import java.util.ArrayList;
import java.util.Map;

public class Library implements ApplyOnBorrower{
    Map<Book, ArrayList<BookInstance>> books;
    Map<Borrower, ArrayList<BookInstance>> borrowers;

    public void forAllBorrowers(ApplyOnBorrower apply){

    }

    @Override
    public void applyFunction(Borrower b) {
            PrintAction.getBookByBorrower(b);
    }

    public void performForAllBorrowers() {
        new ApplyOnBorrower() {
            @Override
            public void applyFunction(Borrower b) {

            }
        };
    }
}
