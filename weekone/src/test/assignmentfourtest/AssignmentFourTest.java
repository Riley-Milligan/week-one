package test.assignmentfourtest;

import main.assignmentfour.RemoveX;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentFourTest {

    @Test
    public void canRemoveX() {

        List<String> listOne = Arrays.asList("ax", "bb", "cx");
        List<String> listTwo = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> listThree = Arrays.asList("x");

        assertEquals(Arrays.asList("a", "bb", "c"), RemoveX.removeX(listOne));
        assertEquals(Arrays.asList("a", "bb", "c"), RemoveX.removeX(listTwo));
        assertEquals(Arrays.asList(""), RemoveX.removeX(listThree));
    }
}
