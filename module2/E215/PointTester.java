// Look at the API of the Point class 
// Find out how to construct a Point object
// In a PointTester program
// construct two points with coordinates (3, 4) and (–3, –4)
// Find the distance between them, using the distance method 
// Print the distance, as well as the expected value.
// (Draw a sketch on graph paper to find the value you will expect.)

import java.awt.Point;

public class PointTester {
  public static void main(String[] args){
    Point p1 = new Point(3, 4);
    Point p2 = new Point(-3, -4);

    double distance = p1.distance(p2);
    System.out.println("Distance between points: " + distance);
    System.out.println("Expected distance: 10.0");
  }
}