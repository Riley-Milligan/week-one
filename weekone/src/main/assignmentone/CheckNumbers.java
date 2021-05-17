package main.assignmentone;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CheckNumbers {

    public PerformOperation isOdd = (a) -> {
        if (a % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    };

    public PerformOperation isPrime = (a) -> {
        IntPredicate divisibility = index -> a % index == 0;
        if (a > 2 && IntStream.range(2, a).noneMatch(divisibility) || a == 2) {
            return "PRIME";
        } else {
            return "COMPOSITE";
        }
    };

    public PerformOperation isPalindrome = (a) -> {
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

        for (int i = 1; i < list.size(); i = i + 2) {

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
