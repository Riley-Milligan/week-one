package main.assignmentfive;

public class Sums {

    public static boolean groupSumClump(int start, int[] array, int target)  {

        //if recursed all the way through the array, check if sum has been met
        if (start >= array.length) {
            return target == 0;
        }

        int i = start;
        int sum = 0;


        //take duplicate numbers as a cluster
        while (i < array.length && array[i] == array[start]) {
            sum += array[i];
            i++;
        }

        //Recursive call to check if we're at our target
        if(groupSumClump(i, array, target - sum)) {
            return true;
        }

        return groupSumClump(i, array, target);
    }
}
