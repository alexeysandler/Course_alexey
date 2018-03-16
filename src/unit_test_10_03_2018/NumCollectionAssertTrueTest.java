package unit_test_10_03_2018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.*;
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
                {"-10--8", -9}

        });
    }
    @Test
    public void stringContainsTheGivenNumber() throws UnsortedException {
        NumCollection numCollection = new NumCollection(inputString);
        assertTrue(numCollection.contains(testedNumber));
    }

    @Test(expected = UnsortedException.class)
    public void negativeNotSorted()throws UnsortedException {
        NumCollection numCollection = new NumCollection("-6,-3,-4,-1");

    }

    @Test(expected = UnsortedException.class)
    public void inputNotSorted() throws UnsortedException {
        NumCollection numCollection = new NumCollection("1,6,5");
    }

    @Test(expected = UnsortedException.class)
    public void checkSortedInRange() throws UnsortedException {
        NumCollection numCollection = new NumCollection("6-3");

    }
}