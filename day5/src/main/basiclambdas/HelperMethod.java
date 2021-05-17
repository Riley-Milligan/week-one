package main.basiclambdas;

import java.util.Comparator;

public class HelperMethod implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        Boolean a = (o2.toLowerCase().contains("e") );
        Boolean b = (o1.toLowerCase().contains("e"));
        
        return a.compareTo(b);
    }

    public static int eSortHelper(String nameOne, String nameTwo) {
        HelperMethod helperMethod = new HelperMethod();

        return helperMethod.compare(nameOne, nameTwo);
    }


}
