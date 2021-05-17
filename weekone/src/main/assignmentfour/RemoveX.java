package main.assignmentfour;

import java.util.ArrayList;
import java.util.List;

public class RemoveX {

    public static List<String> removeX(List<String> list) {

        List<String> removedX = new ArrayList<>();
        list.forEach(s -> removedX.add(s.replace("x", "")));

        return removedX;
    }
}
