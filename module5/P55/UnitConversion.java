import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[][] conversionFactors = {
            {"fl. oz", "ml", 29.5735},
            {"gal", "l", 3.78541},
            {"oz", "g", 28.3495},
            {"lb", "kg", 0.453592},
            {"in", "mm", 25.4},
            {"ft", "cm", 30.48},
            {"mi", "km", 1.60934}
        };

        boolean valid = false;
        String fromUnit = "";
        String toUnit = "";
        double value = 0.0;

        // Ask user input
        while (!valid) {
            System.out.println("Enter the unit you want to convert from (fl. oz, gal, oz, lb, in, ft, mi): ");
            fromUnit = input.nextLine();

            System.out.println("Enter the unit you want to convert to (ml, l, g, kg, mm, cm, m, km): ");
            toUnit = input.nextLine();

            // Check for valid conversions
            for (Object[] row : conversionFactors) {
                if (row[0].equals(fromUnit) && row[1].equals(toUnit)) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
              System.out.println("Invalid conversion. Please try again.");
            }
        }

        valid = false;
        while (!valid) {
          try {
            value = input.nextDouble();
            valid = false;
          } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value: ");
            // continue loop
          }
        }

        // Perform conversion
        for (Object[] unit : conversionFactors) {
            if (unit[0].equals(fromUnit) && unit[1].equals(toUnit)) {
                double convertedValue = value * (double) unit[2];
                System.out.println("\n" + value + " " + fromUnit + " is equal to " + convertedValue + " " + toUnit);
                break;
            }
        }

        input.close();
    }
}