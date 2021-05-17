package commandlinesum;

import java.util.ArrayList;

public class SumLogic {

    //loops through integers provided by user and returns the sum of all given integers
    public Integer getSum(ArrayList<Integer> integers) {

        int sum = 0;

        for (int i : integers) {
            sum = sum + i;
        }

        return sum;
    }
}
