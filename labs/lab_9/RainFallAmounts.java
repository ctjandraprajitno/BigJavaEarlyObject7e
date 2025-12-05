import java.util.Scanner;

public class RainFallAmounts {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Month[] months = new Month[12];
    String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    int rainfall = -1;
    int totalRainfall = 0;
    double averageRainfall;
    Month highRain = null;
    Month lowRain = null;
    Boolean validInput = false;

    for (int i = 0; i <months.length; i++) {
      while (!validInput || rainfall < 0) {
        try {
          System.out.print("Enter the rainfall amount in inches for " + monthNames[i] + ": ");
          rainfall = input.nextInt();
          months[i] = new Month(monthNames[i], rainfall);
          validInput = true;
        }
        catch (Exception e) {
          System.out.println("Invalid input. Please enter a valid integer.");
          continue;
        }
      }
      validInput = false;
    }

    for (int i = 0; i <months.length; i++) {
      totalRainfall += months[i].getAmount();
      if (highRain == null || (highRain.getAmount() < months[i].getAmount())) {
        highRain = months[i];
      }
      else if (lowRain == null || (lowRain.getAmount() < months[i].getAmount())) {
        lowRain = months[i];
      }
    }

    averageRainfall = (double) totalRainfall / months.length;

    input.close();

    System.out.println("Total Rainfall is " + totalRainfall + " inches");
    System.out.println("Average Monthly Rainfall is " + averageRainfall + " inches");
    System.out.println("Highest Monthly Rainfall is " + highRain.getAmount() + " inches in " + highRain.getMonthName());
    System.out.println("Lowest Monthly Rainfall is " + lowRain.getAmount() + " inches in " + lowRain.getMonthName());
  }
}