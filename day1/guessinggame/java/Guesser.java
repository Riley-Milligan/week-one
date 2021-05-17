import java.util.Random;

public class Guesser {

    Random random = new Random();


    //Generates a number 1-100
    public int getNumber() {
        int number = random.nextInt(99) + 1;
        return number;
    }

    //checks user guesses to see if they are within 10 of the generated number
    public boolean checkGuess(int guess, int number) {

        boolean correctness;

        if (Math.abs(guess - number) <= 10) {
            correctness = true;
        } else {
            correctness = false;
        }

        return correctness;
    }
}
