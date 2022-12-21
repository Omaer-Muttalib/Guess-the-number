import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Create a main() method
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
       // System.out.println("Random number is " + randomNumber);
        int tryCount = 0;



        while (true) {
            System.out.println("Guess the number between 1 and 100!");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + tryCount + " attempts. ");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Guess higher! Try again");
            } else {
                System.out.println("The number is lower, Try again!");
            }



        }
        scanner.close();
    }
}

        // Use the following code to create a random number from 1 to 100:
        // Note: you may have to import the Random class
        // int randomNumber = new Random().nextInt(100) + 1;
        // Create a Scanner object


        // Create a variable to hold the number of guess attempts, example
        // int guessAttempts = 6;


        // While the user has more than 0 guess attempts...

            // Ask the user for a number between 1 and 100


            // If the user's number matches the random number tell the user they guessed correctly!
            // Stop the program using:
            // System.exit(0);


            // Otherwise, if the user's number is lower than the random number,
            // tell them they guessed too low

                // Decrease the number of attempts by 1


            // Otherwise, tell the user they guessed too high

                // Decrease the number of attempts by 1


        // Outside the loop, tell the user they have lost and reveal the random number!



        /*
         * Feel free to add any additional rules :)
         */

