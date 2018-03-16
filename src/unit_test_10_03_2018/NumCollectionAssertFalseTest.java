package unit_test_10_03_2018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class NumCollectionAssertFalseTest {
    private String inputString;
    private int testedNumber;


    public NumCollectionAssertFalseTest(String inputString, int testedNumber) {
        this.inputString = inputString;
        this.testedNumber = testedNumber;
    }

    @Parameterized.Parameters(name = "{index}: rangeTest({0})")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"-1,1,3", 0},
                {"1,3-6", 7},
                {"-6,-3,-2,-1", -5},
                {"1,3-6,9,20-22,24-26", 23},
                {"5", 4},
                {"-1", 0},
                {"3-6", -6},
                {"1,3,5", 4},
                {"-21,-3,5", -24},
                {"-10--8", -7}

        });
    }
    @Test
    public void stringContainsTheGivenNumber() throws UnsortedException {
        NumCollection numCollection = new NumCollection(inputString);
        assertFalse(numCollection.contains(testedNumber));
    }
}
