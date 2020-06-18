package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateObjectTask {


    public static String dateToString (Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public static Date stringToDate (String date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(DateObjectTask.dateToString(new Date()));
        System.out.println(DateObjectTask.stringToDate("1999-06-15 11:41:11"));
    }
}


