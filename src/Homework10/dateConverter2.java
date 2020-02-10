package Homework10;

/* HomeWork:2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class dateConverter2 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd 12:10:56 a");
        Calendar calendar = new GregorianCalendar(2013,5,7);
        System.out.println(sdf.format(calendar.getTime()));

    }


}
