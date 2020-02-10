package Homework10;

/*   HomeWork:1. Convert this date into string format "Fri, June 7 2013" */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateConverter {


    public static void main(String[] args) throws ParseException {

        String givenDate = "Fri, June 7 2013";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d yyyy");
        Date parseDate = sdf.parse(givenDate);
        System.out.println(parseDate);


    }
}
