package lesson_4_03_2017.books_before_quize_2;

public class PrintAction {

    Borrower borrower;

    public PrintAction(Borrower borrower) {
        this.borrower = borrower;
    }
    public static void getBookByBorrower(Borrower borrower){
        System.out.println(borrower.getName() +" "+ borrower.getAmountBorrowedBooks());
    }
}
