package test.assignmentsixtest;

import main.assignmentfive.Sums;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssignmentSixTest {

    @Test
    public void canGetSumMatching() {

        int[] arrayOne = new int[]{2, 4, 8};
        int[] arrayTwo = new int[]{1, 2, 4, 8, 1};
        int[] arrayThree = new int[]{2, 4, 4, 8};
        int[] arrayFour = new int[]{1, 2, 2, 2, 5};

        assertTrue(Sums.groupSumClump(0, arrayOne, 10));
        assertTrue(Sums.groupSumClump(0, arrayTwo, 14));
        assertTrue(Sums.groupSumClump(0, arrayFour, 7));
        assertFalse(Sums.groupSumClump(0, arrayThree, 14));
        assertFalse(Sums.groupSumClump(0, arrayFour, 8));
    }

}
