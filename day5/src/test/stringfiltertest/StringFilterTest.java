package test.stringfiltertest;

import main.stringfilter.StringFilter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class StringFilterTest {

    @Test
    public void canFilterList() {

        List<String> list = new ArrayList<>();
        list.add("no");
        list.add("yes");
        list.add("and");
        list.add("ark");
        list.add("boy");
        list.add("aardvark");

        List<String> expected = new ArrayList<>();
        expected.add("and");
        expected.add("ark");

        List<String> unexpexted = new ArrayList<>();
        list.add("and");
        list.add("ark");
        list.add("aardvark");

        assertEquals(expected, StringFilter.filterStrings(list));
        assertNotEquals(unexpexted, StringFilter.filterStrings(list));
    }

}
