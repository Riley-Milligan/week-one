package main.stringfilter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStrings(List<String> list) {

        //filters strings that have a length of 3 and start with a, and returns them
        return list.stream().filter(s -> s.length() == 3 && s.charAt(0) == 'a').collect(Collectors.toList());
    }

}
