package unit_test_10_03_2018;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumCollectionTest {

    @Test
    public void checkMixedRange() throws UnsortedException {
        NumCollection numCollection = new NumCollection("1,3-6");
        assertTrue(numCollection.contains(6));
    }
    @Test
    public void checkMixedRangeStartsNegative() throws UnsortedException {
        NumCollection numCollection = new NumCollection("-1,3");
        assertTrue(numCollection.contains(-1));
    }
    @Test
    public void checkMixedRangeOnlyNegative() throws UnsortedException {
        NumCollection numCollection = new NumCollection("-6,-3,-2,-1");
        assertTrue(numCollection.contains(-1));
    }

    @Test
    public void checkMixedRangeBetweenNotRanges() throws UnsortedException {
        NumCollection numCollection = new NumCollection("1,3-6,9,20-22");
        assertTrue(numCollection.contains(22));
    }

    @Test
    public void containsSpecificPositiveNumberOnOneValueArray() throws UnsortedException {
        NumCollection numCollection = new NumCollection("5");
        assertTrue(numCollection.contains(5));
    }

    @Test
    public void givenPositiveNumberNotFoundOnTheCollection() throws UnsortedException {
        NumCollection numCollection = new NumCollection("5");
        assertFalse(numCollection.contains(1));
    }
    @Test
    public void containsSpecificNegativeNumberOnOneValueArray() throws UnsortedException {
        NumCollection numCollection=new NumCollection("-1");
        assertTrue(numCollection.contains(-1));
    }

    @Test
    public void givenNegativeNumberNotFoundOnTheCollection() throws UnsortedException {
        NumCollection numCollection=new NumCollection("-1");
        assertFalse(numCollection.contains(-2));
    }
    @Test
    public void inputIsSorted() throws UnsortedException {
        NumCollection numCollection = new NumCollection("1,3,5");
        assertTrue(numCollection.contains(5));
    }

    @Test(expected = UnsortedException.class)
    public void inputNotSorted() throws UnsortedException {
        NumCollection numCollection = new NumCollection("1,6,5");
    }

    @Test(expected = UnsortedException.class)
    public void checkSortedInRange() throws UnsortedException {
        NumCollection numCollection = new NumCollection("6-3");

    }
    @Test
    public void checkInRange() throws UnsortedException {
        NumCollection numCollection = new NumCollection("3-6");
        assertTrue(numCollection.contains(5));
    }
}