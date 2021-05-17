package test.stringfiltertest;

import main.stringfilter.StringFilter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class StringFilterTest {

    @Test
    public void canFilterList() {

        List<String> list = Arrays.asList("no", "yes", "and", "ark", "boy", "aardvark");
        List<String> expected = Arrays.asList("and", "ark");
        List<String> unexpected = Arrays.asList("and", "ark", "aardvark");


        assertEquals(expected, StringFilter.filterStrings(list));
        assertNotEquals(unexpected, StringFilter.filterStrings(list));
    }

}
