package lesson_4_03_2017.books_before_quize_2;

public class BookInstance {
    private Book book;
    private int id;
    private Borrower borrower;

    public BookInstance(Book book, int id, Borrower borrower) {
        this.book = book;
        this.id = id;
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
