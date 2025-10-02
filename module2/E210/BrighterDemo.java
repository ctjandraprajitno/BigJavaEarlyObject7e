// In the Java library, a color is specified by its red, green, and blue components between 0 and 255 (see Table 4 on page 57). Write a program BrighterDemo that constructs a Color object with red, green, and blue values of 50, 100, and 150. Then apply the brighter method of the Color class and print the red, green, and blue values of the resulting color. (You won’t actually see the color—see Exercise •• Graphics E2.11 on how to display the color.)

import java.awt.Color;

public class BrighterDemo {
  public static void main(String[] args) {
    Color originalColor = new Color(50, 100, 150);
    System.out.println("Original Color:");
    System.out.println(originalColor);

    Color brighterColor = originalColor.brighter();
    System.out.println("\nBrighter Color:");
    System.out.println(brighterColor);
  }
}
