package main.assignmenttwo;

import java.util.ArrayList;
import java.util.List;

public class RightMostDigit {

    public static List<Integer> getRightMostDigits(List<Integer> list) {

        List<Integer> rightMosts = new ArrayList<>();
        list.forEach((n -> rightMosts.add(n % 10)));

        return rightMosts;
    }
}
