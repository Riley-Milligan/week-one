package main.assignmentone;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CheckNumbers {

    public PerformOperation isOdd = (a) -> {
        //if a number is not divisible by two, it's odd
        if (a % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    };

    public PerformOperation isPrime = (a) -> {
        //defining divisibility as a condition
        IntPredicate divisibility = index -> a % index == 0;
        //If a number is greater than 2, stream will check all numbers 2 to number - 1 for divisibility.  2 is prime, under 2 is not prime
        if (a > 2 && IntStream.range(2, a).noneMatch(divisibility) || a == 2) {
            return "PRIME";
        } else {
            return "COMPOSITE";
        }
    };

    public PerformOperation isPalindrome = (a) -> {
        //converts the given integer to a string, reverses it, and checks if the reversed string is equal to the original string
        String num = a.toString();
        String reverse = new StringBuilder(num).reverse().toString();
        if (num.length() > 1 && num.equals(reverse)) {
            return "PALINDROME";
        } else {
            return "NOT PALINDROME";
        }
    };

    public String scanNumbers(List<Integer> list) {

        String toReturn = "";

        //loops through given string starting at index[1].  Takes the odd index to define check type, and the even index as the number to check
        for (int i = 1; i < list.size(); i = i + 2) {

            //Runs the specified check, appends the result to the return string, and starts a new line in the return string
            if (list.get(i) == 1) {
                toReturn = toReturn.concat(isOdd.operation(list.get(i + 1)) + "\n");
            } else if (list.get(i) == 2) {
                toReturn = toReturn.concat( isPrime.operation(list.get(i + 1)) + "\n");
            } else if (list.get(i) == 3) {
                toReturn = toReturn.concat(isPalindrome.operation(list.get(i + 1)) + "\n");
            } else {
                toReturn = toReturn.concat("invalid operation argument \n");
            }
        }

        return toReturn;
    }
}
