package unit_test_10_03_2018;

import java.util.*;

public class NumCollection implements Iterable<Integer> {

    List<String> finalAcomplishedList;
    List<String> containsRangesList;

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
    public NumCollection(String numCollectionStr)throws UnsortedException{
        stringToList(numCollectionStr);
    }

    private List stringToList(String numCollectionStr) throws UnsortedException {
        containsRangesList = new ArrayList<>();
        finalAcomplishedList = Arrays.asList(numCollectionStr.split(","));

        if (isNegativeRangeExists(finalAcomplishedList)) {
            acomplishNegativeRangeToList(finalAcomplishedList.get(0));
//            String acomplishedMinusRange = changeDoubleMinusToMinus(finalAcomplishedList.get(0));
//            finalAcomplishedList.remove(0);
//            List<String> templist = Arrays.asList(acomplishedMinusRange.split(","));

        }


    // check if first num in the list is negative
            if (finalAcomplishedList.get(0).startsWith("-")) {
                checkIfListSortedAndAcomplishTheRange(finalAcomplishedList);
                if(finalAcomplishedList.size()==1) {
                    return finalAcomplishedList;
                }
            }

        // check if there is range in the input (5-9, etc..)
        if (isPositiveRangeExists(finalAcomplishedList)) {
            addAcomplishedRangeListsToFinalList();
        }


        return checkIfListSortedAndAcomplishTheRange(finalAcomplishedList);
    }

    private void acomplishNegativeRangeToList() {
        acomplishNegativeRangeToList();
    }


    private boolean isNegativeRangeExists(List<String> list) {
        boolean exists = false;
        for(String string : list){
            if(string.contains("--")){
                return true;
            }
        }
        return exists;
    }

    private void addAcomplishedRangeListsToFinalList() throws UnsortedException {
        for(String string : finalAcomplishedList) {
            if( !isListValueContainsRange(string)){
                containsRangesList.add(string);
            }else {
                if(finalAcomplishedList.contains("--")){
                    containsRangesList.addAll(acomplishNegativeRangeToList(string));
                }
                containsRangesList.addAll(splitByMinusAndAcomplishList(string));
            }
        }
        finalAcomplishedList = containsRangesList;
    }

    private List<String> acomplishNegativeRangeToList(String string) throws UnsortedException {
        List <String>tempList = Arrays.asList(string.split("--"));
        List<String> retList = new ArrayList<>();
        int firstNumber = Integer.parseInt(tempList.get(0));
        int lastNumber = (Integer.parseInt(tempList.get(1))* -1);
        if (lastNumber < firstNumber) {
            throw new UnsortedException();
        }
        for(int i = firstNumber; i <= lastNumber; i++ ){
            retList.add(Integer.toString(i));
        }
        return retList;
    }


    private boolean isListValueContainsRange(String string) {

        return string.contains("-");

    }

    private List<String> checkIfListSortedAndAcomplishTheRange(List<String> notAcomplishedList) throws UnsortedException {
        int nextValue;

        int minValue = Integer.parseInt(notAcomplishedList.get(0));
        for (int i = 0; i < notAcomplishedList.size(); i++ ) {
            String currentString = notAcomplishedList.get(i);
            if(currentString.contains("--")){
                changeDoubleMinusToMinus(currentString);
            }
            nextValue = Integer.parseInt(currentString);
            if (minValue <= nextValue) {
                minValue = nextValue;
            }else {
                throw new UnsortedException();
            }
        }
        return notAcomplishedList;
    }
    // create  acomplished List (6-9 => 6,7,8,9)
    private List<String> splitByMinusAndAcomplishList(String numCollectionStr) throws UnsortedException {
        List <String>tempList = Arrays.asList(numCollectionStr.split("-"));
        List<String> retList = new ArrayList<>();
        int firstNumber = Integer.parseInt(tempList.get(0));
        int lastNumber = Integer.parseInt(tempList.get(1));
        if (lastNumber < firstNumber) {
            throw new UnsortedException();
        }
            for(int i = firstNumber; i <= lastNumber; i++ ){
                retList.add(Integer.toString(i));

            }


        return retList;
    }

    private boolean isPositiveRangeExists(List<String> list) {
        boolean exists = false;
        for(String string : list){
            if(string.contains("-")&& !string.startsWith("-")){
                return true;
            }
        }
        return exists;
    }

    public boolean contains(int number)
    {
        return finalAcomplishedList.contains(Integer.toString(number));
    }

    public String changeDoubleMinusToMinus(String currentString){
        CharSequence minusMinus = "--";
        CharSequence minus = ",-";
            String newString = currentString.replace(minusMinus, minus);
            int i =0;
        return newString;
    }
}
