// Implement a class Balloon. 
// A balloon starts out with radius 0. 
// Supply a method public void inflate(double amount) that increases the radius by the given amount. 
// Supply a method public double getVolume() that returns the current volume of the balloon. 
// Use Math.PI for the value of π. To compute the cube of a value r, just use r * r * r

public class Balloon {
  
  private float radius = 0;

  public void setRad(int radius) {
    radius = 0;
  }

  public void inflate(double amount) {
    radius += amount;
  }
  public double getVolume() {
    return (4.0/3.0) * Math.PI * radius * radius * radius;
  }
}
