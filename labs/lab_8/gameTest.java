import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class gameTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GameFunctions game = new GameFunctions();

    ArrayList<String> validChoices = new ArrayList<String>(Arrays.asList("rock", "paper", "scissors", "exit"));

    System.out.println("Welcome to Rock, Paper, Scissors!");

    while (true) {
      System.out.println("Please enter your choice (rock, paper, or scissors) or type 'exit' to quit:");
      String userChoice = input.nextLine().trim().toLowerCase();

      if (userChoice.equals("exit")) {
      System.out.println("Goodbye!");
      break;
      }

      while (!validChoices.contains(userChoice)) {
      System.out.println("Invalid choice. Please enter rock, paper, or scissors (or 'exit' to quit):");
      userChoice = input.nextLine().trim().toLowerCase();
      }
      if (userChoice.equals("exit")) {
        System.out.println("Goodbye!");
        break;
    }

      game.choose();
      System.out.println(GameFunctions.whoWon(userChoice) + " wins!");
    }

    input.close();
  }
}
