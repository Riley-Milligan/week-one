package main.commalist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommaList {

    //takes the given string, performs isEven on each integer, and turns the resulting string list into a string delimited with comma space
    public String listToString(List<Integer> list) {

        List<String> toJoin = new ArrayList<>();

        list.forEach((n) -> toJoin.add(isEven(n)));

        return toJoin.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    //Checks if given integer id odd or even, places it in a string, prepends the appropriate letter, and returns it as a string
    public String isEven(Integer number) {
        OddEven even = (Integer n) -> "e" + number;
        OddEven odd = (Integer n) -> "o" + number;

        String processedNumber;

        if (number % 2 == 0) {
            processedNumber = even.oddEven(number);
        } else {
            processedNumber = odd.oddEven(number);
        }

        return processedNumber;
    }

}
