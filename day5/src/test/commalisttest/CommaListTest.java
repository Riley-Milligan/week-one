package test.commalisttest;

import main.commalist.CommaList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CommaListTest {

    @Test
    public void canCheckForEvenness() {

        CommaList commaList = new CommaList();

        int one = 1;
        int two = 2;

        assertEquals("o1", commaList.isEven(one));
        assertEquals("e2", commaList.isEven(two));

        assertNotEquals("e1", commaList.isEven(one));
        assertNotEquals("o2", commaList.isEven(two));
    }

    @Test
    public void canStreamList() {

        CommaList commaList = new CommaList();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        String expected = "o1, e2, o3, e4";
        String unexpected = "e1, o2, e3, o4";

        assertEquals(expected, commaList.listToString(list));
        assertNotEquals(unexpected, commaList.listToString(list));
    }
}
