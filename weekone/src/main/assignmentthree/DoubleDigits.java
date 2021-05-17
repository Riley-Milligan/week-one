package main.assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class DoubleDigits {


    public static List<Integer> doubleDigits(List<Integer> list) {

        List<Integer> doubled = new ArrayList<>();
        list.forEach((integer -> doubled.add(integer * 2)));

        return doubled;
    }
}
