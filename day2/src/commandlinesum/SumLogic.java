package commandlinesum;

import java.util.ArrayList;

public class SumLogic {

    public Integer getSum(ArrayList<Integer> integers) {

        int sum = 0;

        for (int i : integers) {
            sum = sum + i;
        }

        return sum;

    }

}
