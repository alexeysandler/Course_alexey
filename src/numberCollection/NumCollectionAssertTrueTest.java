package numberCollection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import unit_test_10_03_2018.UnsortedException;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumCollectionAssertTrueTest {
    private String inputString;
    private int testedNumber;


    public NumCollectionAssertTrueTest(String inputString, int testedNumber) {
        this.inputString = inputString;
        this.testedNumber = testedNumber;
    }


    @Parameters(name = "{index}: rangeTest({0})")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"-1,1,3", 3},
                {"1,3-6", 6},
                {"-6,-3,-2,-1", -1},
                {"1,3-6,9,20-28", 5},
                {"1,3-6,9,20-28", 22},
                {"5", 5},
                {"-1", -1},
                {"3-6", 5},
                {"1,3,5", 5},
                {"-21,-3,5", -3},
                {"-5,-6,-2", -6}


        });
    }
    @Test
    public void stringContainsTheGivenNumber() throws UnsortedException, UnsortedValuesException {
        NumCollection numCollection = new NumCollection(inputString);
        assertTrue(numCollection.contains(testedNumber));
    }

    @Test(expected = UnsortedValuesException.class)
    public void negativeNotSorted() throws UnsortedException, UnsortedValuesException {
        NumCollection numCollection = new NumCollection("-6,-3,-4,-1");

    }

    @Test(expected = UnsortedValuesException.class)
    public void inputNotSorted() throws UnsortedException, UnsortedValuesException {
        NumCollection numCollection = new NumCollection("1,6,5");
    }

    @Test(expected = UnsortedValuesException.class)
    public void checkSortedInRange() throws UnsortedException, UnsortedValuesException {
        NumCollection numCollection = new NumCollection("6-3");

    }
}