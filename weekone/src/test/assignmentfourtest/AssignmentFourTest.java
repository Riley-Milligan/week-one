package test.assignmentfourtest;

import main.assignmentfour.RemoveX;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentFourTest {

    @Test
    public void canRemoveX() {

        List<String> list = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> expected = Arrays.asList("a", "bb", "c");
        List<String> actual = RemoveX.removeX(list);

        assertEquals(expected, actual);
    }
}
