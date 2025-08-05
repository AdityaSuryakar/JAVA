//Program to display particular day when date is entered using command line
//argument. E.g. C:\>javac Calendar.java
//C:\>java Calendar 28 08 2020
//The Day for given date is Friday

package com.dkte;import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java MyCalendar <day> <month> <year>");
            return;
        }

        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]) - 1; // Calendar months are 0-based
        int year = Integer.parseInt(args[2]);

        GregorianCalendar cal = new GregorianCalendar(year, month, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String dayName = "";
        switch (dayOfWeek) {
            case Calendar.SUNDAY: dayName = "Sunday"; break;
            case Calendar.MONDAY: dayName = "Monday"; break;
            case Calendar.TUESDAY: dayName = "Tuesday"; break;
            case Calendar.WEDNESDAY: dayName = "Wednesday"; break;
            case Calendar.THURSDAY: dayName = "Thursday"; break;
            case Calendar.FRIDAY: dayName = "Friday"; break;
            case Calendar.SATURDAY: dayName = "Saturday"; break;
        }

        System.out.println("The Day for given date is " + dayName);
    }
}
