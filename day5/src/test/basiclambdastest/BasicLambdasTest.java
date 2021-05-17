package test.basiclambdastest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.basiclambdas.*;

import java.util.Arrays;

public class BasicLambdasTest {

    @Test
    public void canSortByLength() {

        String[] names = new String[]{"Bob", "Ronald", "Edith"};
        String[] expected = new String[]{"Bob", "Edith", "Ronald"};
        String[] unexpected = new String[]{"Ronald", "Edith", "Bob"};

        BasicLambdas basicLambdas = new BasicLambdas();

        assertArrayEquals(expected, basicLambdas.lengthSort(names));
        assertFalse(Arrays.equals(unexpected, basicLambdas.lengthSort(names)));
    }

    @Test
    public void canReverseSortByLength() {

        String[] names = new String[]{"Bob", "Ronald", "Edith"};
        String[] expected = new String[]{"Ronald", "Edith", "Bob"};
        String[] unexpected = new String[]{"Bob", "Edith", "Ronald"};

        BasicLambdas basicLambdas = new BasicLambdas();

        assertArrayEquals(expected, basicLambdas.reverseLengthSort(names));
        assertFalse(Arrays.equals(unexpected, basicLambdas.reverseLengthSort(names)));
    }

    @Test
    public void canSortAlphabeticallyByFirstChar() {

        String[] names = new String[]{"Bob", "Ronald", "Edith"};
        String[] expected = new String[]{"Bob", "Edith", "Ronald"};
        String[] unexpected = new String[]{"Ronald", "Edith", "Bob"};

        BasicLambdas basicLambdas = new BasicLambdas();

        assertArrayEquals(expected, basicLambdas.firstCharSort(names));
        assertFalse(Arrays.equals(unexpected, basicLambdas.firstCharSort(names)));
    }

    @Test
    public void canSortByContainingE() {

        String[] names = new String[]{"Bob", "Ronald", "Edith"};
        String[] expected = new String[]{"Edith", "Bob", "Ronald"};
        String[] unexpected = new String[]{"Ronald", "Edith", "Bob"};

        BasicLambdas basicLambdas = new BasicLambdas();

        assertArrayEquals(expected, basicLambdas.containsESort(names));
        assertFalse(Arrays.equals(unexpected, basicLambdas.containsESort(names)));
    }
}
