import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Printer {

    String[] stars = new String[12];
    String toPrint = new String();
    int i = 0;
    int x = 0;

    //sets specified index to *
    private void addStar(int index) {
        stars[index] = "*";
    }

    //sets specified index to dot
    private void addDot(int index) {
        stars[index] = ".";
    }

    //sets specified index to a space
    private void addSpace(int index) {
        stars[index] = " ";
    }

    //empties stars
    //called after filling to prepare for next fill
    private void reset() {
        for (i = 0; i < stars.length; i++) {
            addSpace(i);
        }
    }

    //prints current stars string
    private void printStars() {
        toPrint = String.join("", stars);
        System.out.println(toPrint);
    }

    public void firstPrint() {

        reset();

        System.out.println("1)");

        //partially fills array with stars, starting from the left, then prints
        for (i = 0; i < 4; i++) {
            addStar(i);
            printStars();
        }

        reset();

        //fills with 0 dots
        for (x = 0; x < 9; x++) {
            addDot(x);
        }

        printStars();

        reset();
    }

    public void secondPrint() {

        reset();

        System.out.println("2)");

        //fills with dots
        for (x = 0; x < 10; x++) {
            addDot(x);
        }

        printStars();

        reset();

        //fills with stars, then removes them starting from the left
        for (i = 0; i < 4; i++) {
            addStar(i);
        }

        for (i = 3; i >= 0; i--) {
            printStars();
            addSpace(i);
        }

        reset();

    }

    public void thirdPrint() {

        reset();

        System.out.println("3)");

        i = 5;
        x = 5;

        //fills array with stars starting from the center moving outwards
        while (i < 9 && x > 1) {
            addStar(x);
            addStar(i);
            i++;
            x--;
            printStars();
        }

        reset();

        //fills with dots
        for (x = 0; x < 11; x++) {
            addDot(x);
        }

        printStars();

        reset();

    }

    public void fourthPrint() {

        reset();

        System.out.println("4)");

        //fills with dots
        for (x = 0; x < stars.length; x++) {
            addDot(x);
        }

        printStars();

        reset();

        //fills center of array with dots, starting from center-left
        for (i = 2; i < 9; i++) {
            addStar(i);
        }

        printStars();

        i = 2;
        x = 8;

        //removes stars from array, starting from the outside and working inwards
        while (i != x) {
            addSpace(i);
            addSpace(x);
            i++;
            x--;
            printStars();
        }

        reset();
    }

}
