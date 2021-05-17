package test.assignmentthreetest;

import main.assignmentthree.DoubleDigits;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentThreeTest {

    @Test
    public void canDoubleDigits() {

        List<Integer> listOne = Arrays.asList(1, 2, 3);
        List<Integer> listTwo = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> listThree = Arrays.asList();

        assertEquals(Arrays.asList(2, 4, 6), DoubleDigits.doubleDigits(listOne));
        assertEquals(Arrays.asList(12, 16, 12, 16, -2), DoubleDigits.doubleDigits(listTwo));
        assertEquals(Arrays.asList(), DoubleDigits.doubleDigits(listThree));
    }

}
