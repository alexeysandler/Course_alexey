package unit_test_10_03_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumCollection implements Iterable<Integer> {
    private String numCollectionStr;
    List<String> notAcomplishedList;
    List<String> acomplishedList;

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
    public NumCollection(String numCollectionStr)throws UnsortedException{
        stringToList(numCollectionStr);
    }

    private List stringToList(String numCollectionStr) throws UnsortedException {
        List<String> containsRangesList = new ArrayList<>();
        acomplishedList = Arrays.asList(numCollectionStr.split(","));


            if (acomplishedList.get(0).startsWith("-")) {
                acomplishTheList(acomplishedList);
                if(acomplishedList.size()==1) {
                    return acomplishedList;
                }
            }


        if(isRangeExists(acomplishedList)){
            for(String string : acomplishedList) {
                if( !isListValueContainsRange(string)){
                    containsRangesList.add(string);
                }else {
                    containsRangesList.addAll(splitByMinusAndAcomplishRange(string));
                }
            }
            acomplishedList = containsRangesList;
            return containsRangesList;
        }
        return acomplishTheList(acomplishedList);
    }

    private boolean isListValueContainsRange(String string) {

        return string.contains("-");

    }

    private List<String> acomplishTheList(List<String> notAcomplishedList) throws UnsortedException {
        int nextValue;
        String currentString;
        int minValue = Integer.parseInt(notAcomplishedList.get(0));
        for (int i = 1; i < notAcomplishedList.size(); i++ ) {
            currentString = notAcomplishedList.get(i);

            nextValue = Integer.parseInt(notAcomplishedList.get(i));
            if (minValue <= nextValue) {
                minValue = nextValue;
            }else {
                throw new UnsortedException();
            }
        }
        return notAcomplishedList;
    }

    private List<String> splitByMinusAndAcomplishRange(String numCollectionStr) throws UnsortedException {
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

    private boolean isRangeExists(List<String> list) {
        boolean exists = false;
        for(String string : list){
            if(string.contains("-")&& !string.startsWith("-")){
                exists=true;
            }
        }
        return exists;
    }

    private List<String> splitByMinus(String currentString) {
        List retList = new ArrayList();
        return retList = Arrays.asList(currentString.split("-"));
    }

    public boolean contains(int number)
    {
        return acomplishedList.contains(Integer.toString(number));
    }


}
