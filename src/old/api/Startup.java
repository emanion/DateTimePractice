

package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) throws ParseException {
        
        
        DemoOne demoOne = new DemoOne();
        
        
        Date date = demoOne.getCurrentDateTime();
        System.out.println(date);
        
        Date date2 = demoOne.getSpecificDateTime();
        System.out.println(date2);
        
        Calendar calendarEds = demoOne.getCurrentCalendar();
        System.out.println(calendarEds);
        
        
        //now......   try formatting the Date object
        //now......   try formatting the Date object
        //now......   try formatting the Date object
        //now......   try formatting the Date object
        //lower case mm = minutes
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(date));
        
        //lower case mm = minutes
        SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yy");
        System.out.println(sdf2.format(date));
        
        //lower case mm = minutes
        SimpleDateFormat sdf3 = new SimpleDateFormat("M.d.yy");
        System.out.println(sdf3.format(date));
        
        //lower case mm = minutes
        SimpleDateFormat sdf4 = new SimpleDateFormat("M.d.yy hh:mm:ss a");
        System.out.println(sdf4.format(date));
        
        //lower case mm = minutes
        SimpleDateFormat sdf5 = new SimpleDateFormat("M.d.yy h:m:s a");
        System.out.println(sdf5.format(date));
        
        
        //CANNOT form the Calendar object, but convert it to a DATE object
        //Convert Calendar object to a Date object..  (To get formatting)
        Date tempDate = calendarEds.getTime();
        SimpleDateFormat sdf6 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf6.format(tempDate));
        
        
        
        
        
        
        
        
        
        
        //Converting a String to a Date object.
        //input string HAS TO MATCH the format string  (sdf)
        //seperators have to match also!!!!!
        String s = "10/20/2014 6:19 PM";
        Date dateConvert = sdf.parse(s);
        System.out.println("Parsed Date... " + dateConvert);
        
        //now convert Date to a Calendar object..
        Calendar calConvert = Calendar.getInstance();
        calConvert.setTime(dateConvert);
        System.out.println(calConvert);
        
        
        
        
        
        
        
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        ///////// DOING MATH WITH DATES
        
        Calendar startDate = Calendar.getInstance();
        //startDate.set(2014,0,1);                //january first
        startDate.set(2014,Calendar.JANUARY,1);   //static for month
        Calendar endDate = Calendar.getInstance();
        endDate.set(2014,Calendar.JANUARY,15);
        
        
        
        //move the year of the start date.....
        startDate.roll(Calendar.YEAR, -2);
        
        
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        long diff = endMsec - startMsec;
        long days = diff/1000/60/60/24;
        System.out.println("days between date = " + days);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
