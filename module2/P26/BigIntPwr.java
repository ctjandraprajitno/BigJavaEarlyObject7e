//The BigInteger class represents integer numbers with an arbitrary number of digits. (As you will see in Chapter 4, the int type cannot express very large integers.) 
// You can construct a BigInteger object by providing a string of its digits, 
// such as BigInteger a = new BigInteger("12345678987654321");
// Write a program that prints the square, fourth power, and eighth power of a, using one of the methods of the BigInteger class.

import java.math.BigInteger;

public class BigIntPwr {

  public static void main(String[] args) {
    BigInteger a = new BigInteger("12345678987654321");
    BigInteger sq = a.pow(2);
    BigInteger fp = a.pow(4);
    BigInteger ep = a.pow(8);
    System.out.println("Square: " + sq);
    System.out.println("Fourth Power: " + fp);
    System.out.println("Eighth Power: " + ep);
  }
}
