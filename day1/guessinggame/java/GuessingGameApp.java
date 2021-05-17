import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {

        Guesser guesser = new Guesser();
        Scanner input = new Scanner(System.in);

        int guesses = 0;
        int numberToGuess = guesser.getNumber();
        int guess;

        System.out.println("I have generated a number 1 to 100.  Please try to guess a number within 10 integers of this number.");

        do {

            System.out.println("You have " + (5 - guesses) + " left.  Please input your guess.");

            guess = input.nextInt();

            if (guess > 100 && guesses < 4) {
                System.out.println("I'm sorry, but your guess was outside of the range.  I'm still counting it as a guess though.");
            } else if (guesser.checkGuess(guess, numberToGuess)) {
                System.out.println("Congratulations! You were within 10 integers!  The number was " + numberToGuess);
                break;
            } else if (!guesser.checkGuess(guess, numberToGuess) && guesses < 4) {
                System.out.println("Sorry, that guess was not close enough.  Please guess again.");
            } else if (guesses == 4) {
                System.out.println("Sorry, that guess was not close enough and you are out of guesses.  Please try again later");
                break;
            }

            guesses++;

        } while (guesses < 5);

    }

}
