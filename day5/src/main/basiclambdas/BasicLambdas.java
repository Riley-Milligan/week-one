package main.basiclambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BasicLambdas {

    public String[] lengthSort(String[] names) {

        Arrays.sort(names, Comparator.comparing(String::length));

        return names;

    }

    public String[] reverseLengthSort(String[] names) {

        Arrays.sort(names, Collections.reverseOrder(Comparator.comparing(String::length)));

        return names;
    }


    public String[] firstCharSort(String[] names) {

        Arrays.sort(names, Comparator.comparing(name -> name.charAt(0)));

        return names;
    }

/*
    commented out old version of containsESort method before adding a helper method

    public Object[] containsESort(String[] names) {

        Arrays.sort(names, Comparator.comparing(name -> (name.contains("e") || name.contains("E") ? 0 : 1)));

        return names;
    }*/

    public String[] containsESort(String[] names) {

        Arrays.sort(names, (nameOne, nameTwo) -> HelperMethod.eSortHelper(nameOne, nameTwo));

        return names;
    }
}
