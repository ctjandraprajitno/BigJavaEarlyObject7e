import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TxtToCsv {

  private static String inputFilePath;
  private static String outputFilePath;
  private static String [] parts = new String[3];
  private static String outputLine = "";

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter the path of the input text file: ");
    inputFilePath = userInput.nextLine();
    System.out.print("Enter the path of the out text file: ");
    outputFilePath = userInput.nextLine();
    userInput.close();

    try {
      File inputFile = new File(inputFilePath);
      Scanner fileScanner = new Scanner(inputFile);
      PrintWriter outputFile = new PrintWriter(outputFilePath);

      while(fileScanner.hasNextLine()) {
        for (int i = 0; i < 2; i++) {
          outputLine += fileScanner.nextLine() + ",";
          parts = fileScanner.nextLine().split(" ");
          for (int inner = 0; inner < 2; inner++) {
            outputLine += parts[inner];
          }
          outputLine += ",";
          outputLine += parts[2];
          outputFile.println(outputLine);
          outputLine = "";
        }
      }
      fileScanner.close();
      outputFile.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}