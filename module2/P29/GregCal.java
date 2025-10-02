// Your task is to write a program that prints:
// • The date and weekday that is 100 days from today.
// • The weekday of your birthday.
// • The date that is 10,000 days from your birthday.

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregCal {
  public static void main(String[] args) {
    Calendar cal = new GregorianCalendar();
    
    System.out.println("Today is: " + cal.getTime());
    cal.add(Calendar.DAY_OF_YEAR, 100);
    System.out.println("100 days from today is: " + cal.getTime());

    Calendar birthday = new GregorianCalendar(2000, Calendar.FEBRUARY, 29);
    birthday.add (Calendar.DAY_OF_YEAR, 10000);
    System.out.println("10,000 days from my birthday is: " + birthday.getTime());

    System.out.println("Today is a " + cal.getTime());
  }
}