// Time Zone name: Eastern Standard Time
// Time Zone ID: America/New_York
// Current Time: Sun Sep 07 16:46:40 EDT 2025

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarTime {
    public static void main(String[] args) {
        TimeZone easternTimeZone = TimeZone.getTimeZone("America/New_York");
        GregorianCalendar calendar = new GregorianCalendar(easternTimeZone);
        System.out.println("Time Zone name: " + calendar.getTimeZone().getDisplayName(true, TimeZone.LONG));
        System.out.println("Current Zone ID: " + calendar.getTimeZone().getID());
        System.out.println("Current Time: " + calendar.getTime());
    }
}