package commandlinesum;

import java.util.ArrayList;
import java.util.Scanner;

public class SumApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SumLogic sumLogic = new SumLogic();
        String check = new String();

        ArrayList<Integer> numbersToAdd = new ArrayList<>();

        System.out.println("Enter as many whole numbers as you would like.  When you are done, type 'x' to finish");

        //checks if input is an int.  If it is adds it to the previous numbers.  If x, closes input and proceeds to add the given numbers.
        //if neither, yells at user for bad input
         do {
            if (input.hasNextInt()) {
                numbersToAdd.add(input.nextInt());
            } else if (!input.hasNextInt()) {
                check = input.next();
                if (!check.equals("x")) {
                    System.out.println("Please only enter whole numbers or the letter 'x' to quit.");
                }
            }
        } while (!check.equals("x"));

         //prints the sum
        System.out.println("The sum of your inputted numbers is " + sumLogic.getSum(numbersToAdd) + ". ");
    }
}
