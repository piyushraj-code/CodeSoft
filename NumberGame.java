import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    int totalScore = 0;
    int roundsPlayed = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      int score = playRound(scanner);
      totalScore = totalScore + score;
      roundsPlayed = roundsPlayed + 1;

      System.out.println("Your current score is " + totalScore);
      System.out.println("You have played " + roundsPlayed + " rounds.");

      System.out.print("Do you want to play again? (y/n): ");
      String playAgain = scanner.next();
      if (playAgain.equals("n")) {
        break;
      }
    }

    System.out.println("Thanks for playing! Your final score is " + totalScore);
  }

  public static int playRound(Scanner scanner) {
    Random random = new Random();
    int secretNumber = random.nextInt(100) + 1;

    int attempts = 0;
    int maxAttempts = 6;

    System.out.println("Welcome to the guessing game!");
    System.out.println("I'm thinking of a number between 1 and 100.");

    while (attempts < maxAttempts) {
      System.out.print("Enter your guess: ");
      int userGuess = scanner.nextInt();

      attempts = attempts + 1;

      if (userGuess == secretNumber) {
        System.out.println("Congratulations! You guessed the correct number!");
        return maxAttempts - attempts + 1;
      } else if (userGuess < secretNumber) {
        System.out.println("Your guess is too low. Try again!");
      } else {
        System.out.println("Your guess is too high. Try again!");
      }
    }

    System.out.println("Sorry, you didn't guess the number. The correct answer was " + secretNumber);
    return 0;
  }
}