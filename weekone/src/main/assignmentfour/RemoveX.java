package main.assignmentfour;

import java.util.ArrayList;
import java.util.List;

public class RemoveX {

    public static List<String> removeX(List<String> list) {

        List<String> removedX = new ArrayList<>();
        //takes the given list and replaces x with empty string
        list.forEach(s -> removedX.add(s.replace("x", "")));

        return removedX;
    }
}
