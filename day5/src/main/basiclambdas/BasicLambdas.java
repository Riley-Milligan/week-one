package main.basiclambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BasicLambdas {

    //iterates through given string array and sorts strings by length.
    public String[] lengthSort(String[] names) {

        Arrays.sort(names, Comparator.comparing(name -> name.length()));

        return names;

    }

    //iterates through given string array and sorts by length in reverse order
    public String[] reverseLengthSort(String[] names) {

        Arrays.sort(names, Collections.reverseOrder(Comparator.comparing(name -> name.length())));

        return names;
    }

    //iterates through given string array and orders by the first character without considering following characters
    public String[] firstCharSort(String[] names) {

        Arrays.sort(names, Comparator.comparing(name -> name.charAt(0)));

        return names;
    }

/*
    commented out old version of containsESort method before adding a helper method
    sorts by if the name contains e
    uses ternary condition operator to return a value of 0 if true and 1 if false
    public Object[] containsESort(String[] names) {

        Arrays.sort(names, Comparator.comparing(name -> (name.contains("e") || name.contains("E") ? 0 : 1)));

        return names;
    }*/

    //same as the previously commented out method, but the comparison method is a static helper method
    //my idea really wants me to replace the lambda with a method reference...
    public String[] containsESort(String[] names) {

        Arrays.sort(names, (nameOne, nameTwo) -> HelperMethod.eSortHelper(nameOne, nameTwo));

        return names;
    }
}
