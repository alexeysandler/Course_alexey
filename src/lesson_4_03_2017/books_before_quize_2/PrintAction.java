package lesson_4_03_2017.books_before_quize_2;

import lesson_4_03_2017.quiz_2_quest_3.ApplyOnStudent;
import lesson_4_03_2017.quiz_2_quest_3.Student;

public class PrintAction implements ApplyOnBorrower {


    @Override
    public void applyFunction(Borrower borrower) {

        System.out.println(borrower.getName() +" borrowed "+ borrower.getNumOfTheBooksPerBorrower()+ " books.");
    }

}
