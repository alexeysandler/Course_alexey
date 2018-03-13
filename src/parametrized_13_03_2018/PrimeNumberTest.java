package parametrized_13_03_2018;

import lesson_4_03_2017.books_before_quize_2.PrintAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class PrimeNumberTest {
    private int input;

    public PrimeNumberTest(int input) {
        this.input = input;
    }

    @Test
    public void isPrimeNumbers(){
        assertTrue(PrimeNumber.isPrime(input));
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {11},
                {7},
                {3},
        });
    }
}