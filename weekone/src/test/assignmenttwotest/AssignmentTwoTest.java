package test.assignmenttwotest;

import main.assignmenttwo.RightMostDigit;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssignmentTwoTest {

    @Test
    public void canGetRightMostDigits() {

        List<Integer> list = Arrays.asList(22, 25, 89, 2, 10);
        List<Integer> expected = Arrays.asList(2, 5, 9, 2, 0);
        List<Integer> actual = RightMostDigit.getRightMostDigits(list);

        assertEquals(expected, actual);
    }
}
