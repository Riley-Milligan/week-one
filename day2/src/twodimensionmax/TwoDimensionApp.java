package twodimensionmax;

public class TwoDimensionApp {

    public static void main(String[] args) {

        TwoDimension twoDimension = new TwoDimension();

        twoDimension.fillNumbers();

        twoDimension.printNumbers();

        Integer[] max = twoDimension.maxNumber();

        System.out.println("The highest number in this array is " + max[0] + " at row " + max[1] + " and column " + max[2] + ".");

    }
}
