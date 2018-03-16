package parametrized_13_03_2018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)

public class FactorialAssertFalseTest {
    private int input;
    private int output;

    public FactorialAssertFalseTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Test
    public void factorialMultiTest(){

        assertNotEquals(Factorial1.calcFactorial(input), output);

    }

    @Parameters(name = "{index}: factorial of ({0}) is NOT ({1})")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {5,110},
                {2,4},
                {3,9},
        });
    }





}