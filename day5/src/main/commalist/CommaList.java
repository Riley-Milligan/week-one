package main.commalist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommaList {


    public String listToString(List<Integer> list) {

        List<String> toJoin = new ArrayList<>();

        list.forEach((n) -> toJoin.add(isEven(n)));

        return toJoin.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

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
