import java.util.Scanner;

public class RomanConverter {

  public static void main(String[] args) {
    Object[][] romanNumerals = {
        { "M", 1000 },
        { "CM", 900 },
        { "DCCC", 800 },
        { "DCC", 700 },
        { "DC", 600 },
        { "D", 500 },
        { "CD", 400 },
        { "CCC", 300 },
        { "CC", 200 },
        { "C", 100 },
        { "XC", 90 },
        { "LXXX", 80 },
        { "LXX", 70 },
        { "LX", 60 },
        { "L", 50 },
        { "XL", 40 },
        { "XXX", 30 },
        { "XX", 20 },
        { "X", 10 },
        { "IX", 9 },
        { "VIII", 8 },
        { "VII", 7 },
        { "VI", 6 },
        { "V", 5 },
        { "IV", 4 },
        { "III", 3 },
        { "II", 2 },
        { "I", 1 }
    };

    Scanner input = new Scanner(System.in);
    int number = 0;

    //ask user for positive integer
    while (number > 3999 || number < 1) {

      try {
      System.out.print("Enter a positive integer: ");
      number = input.nextInt();
      } 

      catch (Exception e) {
        System.out.println("Invalid input. Please enter a positive integer.");
        return;
      }
    }

    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < romanNumerals.length; i++) {

      while (number >= (int) romanNumerals[i][1]) {
        result.append((String) romanNumerals[i][0]);
        number -= (int) romanNumerals[i][1];
      }

    }
    
    System.out.println("Roman numeral: " + result.toString());

    input.close();
  }
}