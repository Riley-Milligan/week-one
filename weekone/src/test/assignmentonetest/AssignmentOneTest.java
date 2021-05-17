package test.assignmentonetest;

import main.assignmentone.CheckNumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssignmentOneTest {

    @Test
    public void canCheckEven() {

        CheckNumbers checkNumbers = new CheckNumbers();

        int one = 1;
        int two = 2;

        assertEquals("ODD", checkNumbers.isOdd.operation(one));
        assertEquals("EVEN", checkNumbers.isOdd.operation(two));
    }

    @Test
    public void canCheckPrime() {

        CheckNumbers checkNumbers = new CheckNumbers();

        int one = 1;
        int two = 2;
        int four = 4;
        int seven = 7;
        int bigNumber = 997;

        assertEquals("COMPOSITE", checkNumbers.isPrime.operation(one));
        assertEquals("PRIME", checkNumbers.isPrime.operation(two));
        assertEquals("COMPOSITE", checkNumbers.isPrime.operation(four));
        assertEquals("PRIME", checkNumbers.isPrime.operation(seven));
        assertEquals("PRIME", checkNumbers.isPrime.operation(bigNumber));
    }

    @Test
    public void canCheckPalindrome() {

        CheckNumbers checkNumbers = new CheckNumbers();

        int five = 5;
        int eleven = 11;
        int bigOne = 313;
        int bigTwo = 312;
        int bigThree = 41214;

        assertEquals("NOT PALINDROME", checkNumbers.isPalindrome.operation(five));
        assertEquals("PALINDROME", checkNumbers.isPalindrome.operation(eleven));
        assertEquals("PALINDROME", checkNumbers.isPalindrome.operation(bigOne));
        assertEquals("NOT PALINDROME", checkNumbers.isPalindrome.operation(bigTwo));
        assertEquals("PALINDROME", checkNumbers.isPalindrome.operation(bigThree));
    }

    @Test
    public void canScanNumbers() throws Exception {

        CheckNumbers checkNumbers = new CheckNumbers();

        Integer[] array = new Integer[]{12, 1, 5, 2, 7, 1, 4, 3, 15, 2, 5, 3, 212};

        String expected =
                "ODD\n" +
                "PRIME\n" +
                "EVEN\n" +
                "NOT PALINDROME\n" +
                "PRIME\n" +
                "PALINDROME\n"
                ;

        assertEquals(expected, checkNumbers.scanNumbers(Arrays.asList(array)));
    }
}
