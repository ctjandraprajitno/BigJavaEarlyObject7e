// Your task is to write a program that prints:
// • The date and weekday that is 100 days from today.
// • The weekday of your birthday.
// • The date that is 10,000 days from your birthday.

import java.util.GregorianCalendar;

public class GregCal {
  public static void main(String[] args) {
    GregorianCalendar cal = new GregorianCalendar();
    
    System.out.println("Today is: " + cal.get(GregorianCalendar.MONTH) + "/" + cal.get(GregorianCalendar.DATE) + "/" + cal.get(GregorianCalendar.YEAR));

    cal.add(GregorianCalendar.DAY_OF_YEAR, 100);

    System.out.println("100 days from today is: " + cal.get(GregorianCalendar.DAY_OF_WEEK));

    GregorianCalendar birthday = new GregorianCalendar(2000, GregorianCalendar.FEBRUARY, 29);

    System.out.println("My birthday is on a: " + birthday.get(GregorianCalendar.DAY_OF_WEEK));

    birthday.add (GregorianCalendar.DAY_OF_YEAR, 10000);
    
    System.out.println("10,000 days from my birthday is: " + birthday.get(GregorianCalendar.MONTH) + "/" + birthday.get(GregorianCalendar.DATE) + "/" + birthday.get(GregorianCalendar.YEAR));
  }
}