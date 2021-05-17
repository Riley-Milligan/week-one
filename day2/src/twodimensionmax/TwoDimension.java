package twodimensionmax;

import java.util.Arrays;
import java.util.Random;

public class TwoDimension {

    Random random = new Random();

    Integer[][] numbers = new Integer[10][10];

    public void fillNumbers() {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                numbers[row][column] = (random.nextInt(99) + 1);
            }
        }
    }

    public void printNumbers () {
        for (Integer[] row : numbers) {
            System.out.println(Arrays.asList(row));
        }
    }

    public Integer[] maxNumber() {
        Integer[] max = new Integer[3];

        max[0] = 0;

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                if (numbers[row][column] > max[0]) {
                    max[0] = numbers[row][column];
                    max[1] = row;
                    max[2] = column;
                }
            }
        }

        return max;
    }

}
