package main.assignmenttwo;

import java.util.ArrayList;
import java.util.List;

public class RightMostDigit {

    public static List<Integer> getRightMostDigits(List<Integer> list) {

        List<Integer> rightMosts = new ArrayList<>();
        //the rightmost digit in a given number will be the remainder after dividing by 10.
        list.forEach((n -> rightMosts.add(n % 10)));

        return rightMosts;
    }
}
