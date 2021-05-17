package test.assignmentthreetest;

import main.assignmentthree.DoubleDigits;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssignmentThreeTest {

    @Test
    public void canDoubleDigits() {

        List<Integer> list = Arrays.asList(2, 4, 6, 9);
        List<Integer> expected = Arrays.asList(4, 8, 12, 16);
        List<Integer> actual = DoubleDigits.doubleDigits(list);

    }

}
