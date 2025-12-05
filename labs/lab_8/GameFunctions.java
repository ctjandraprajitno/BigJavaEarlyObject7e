import java.util.Random;

public class GameFunctions {

    static private String computerChoice;
    private Random generator;

    GameFunctions() {
      computerChoice = "";
      generator = new Random();
    }

    public void choose() {
      int choice = generator.nextInt(3);
      switch (choice) {
        case 0:
          computerChoice = "rock";
          break;
        case 1:
          computerChoice = "paper";
          break;
        case 2:
          computerChoice = "scissors";
          break;
      }
      System.out.println("Computer chose: " + computerChoice);
    }

    public static String whoWon(String userChoice) {
      if (userChoice.equals(computerChoice)) {
        return "tie";
      } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                 (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                 (userChoice.equals("paper") && computerChoice.equals("rock"))) {
        return "user";
      } else {
        return "computer";
      }
    }
}