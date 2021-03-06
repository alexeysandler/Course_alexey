package parametrized_13_03_2018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class FibonaciTest {
    private int input;
    private int output;

    public FibonaciTest(int input, int output) {
        this.input = input;
        this.output = output;
    }
    @Test
    public void fibonacciTest(){
        assertEquals(Fibonaci.fibonacci(input),output);
    }

    @Parameters(name = "{index}: fibonacci of({0}) is ({1})")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,3},
                {5,8},
        });
    }
}