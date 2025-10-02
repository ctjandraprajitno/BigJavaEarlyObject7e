// Look into the API documentation of the String class and locate the trim method. Write a program demonstrating what it does. Then show how you can use the replace method to remove all spaces from a string.

public class StringClassPractice {
  public static void main(String[] args) {
    String baseString = "   Hello, World!   ";
    String trimmedString = baseString.trim();
    System.out.println(trimmedString);
    String noSpacesString = baseString.replace(" ", "");
    System.out.println(noSpacesString);
  }
}
