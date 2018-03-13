package lesson_4_03_2017.books_before_quize_2;

public class MainBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Secret1","Steve At11", 1);
        Book book2 = new Book("Secret2","Steve At22", 2);
        Book book3 = new Book("Secret3","Steve At33", 3);
        Book book4 = new Book("Secret4","Steve At44", 4);

        Borrower borrower1 = new Borrower("Alexey", (long) 5);
        Borrower borrower2 = new Borrower("Anna", (long) 7);
        Borrower borrower3 = new Borrower("Koby", (long) 2);
        Borrower borrower4 = new Borrower("Lea", (long) 1);

        BookInstance bookInstance1 = new BookInstance(book4, 1, borrower1);
        BookInstance bookInstance2 = new BookInstance(book3, 2, borrower2);
        BookInstance bookInstance3 = new BookInstance(book1, 3, borrower3);
        BookInstance bookInstance4 = new BookInstance(book2, 4, borrower4);

        Library library = new Library();

        library.addBookToBorrower(borrower1,bookInstance2);
        library.addBookToBorrower(borrower1,bookInstance1);
        library.addBookToBorrower(borrower2,bookInstance1);
        library.addBookToBorrower(borrower2,bookInstance3);
        library.addBookToBorrower(borrower2,bookInstance4);
        library.addBookToBorrower(borrower2,bookInstance2);

        library.printBorrowerAndBooks();
        library.printBorrowerWithSpecificAmount();



    }
}
