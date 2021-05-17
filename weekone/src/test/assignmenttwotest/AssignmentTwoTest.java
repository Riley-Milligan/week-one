package test.assignmenttwotest;

import main.assignmenttwo.RightMostDigit;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssignmentTwoTest {

    @Test
    public void canGetRightMostDigits() {

        List<Integer> listOne = Arrays.asList(22, 25, 89, 2, 10);
        List<Integer> listTwo = Arrays.asList(1, 22, 93);
        List<Integer> listThree = Arrays.asList(16, 8, 886, 8, 1);
        List<Integer> listFour = Arrays.asList(10, 0);


        assertEquals(Arrays.asList(2, 5, 9, 2, 0), RightMostDigit.getRightMostDigits(listOne));
        assertEquals(Arrays.asList(1, 2, 3), RightMostDigit.getRightMostDigits(listTwo));
        assertEquals(Arrays.asList(6, 8, 6, 8, 1), RightMostDigit.getRightMostDigits(listThree));
        assertEquals(Arrays.asList(0, 0), RightMostDigit.getRightMostDigits(listFour));
    }
}
