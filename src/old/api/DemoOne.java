
package old.api;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emanion
 */
public class DemoOne {
    
    public Date getCurrentDateTime() {
        
        Date currentDate = new Date();
        return currentDate;
        
    }
       
    
    public Date getSpecificDateTime() {
        //month is zero based...????
        Date currentDate = new Date(2015-1900,0,1);
        return currentDate;
        
    }
    
    
    
    public Calendar getCurrentCalendar() {
        
        Calendar currentDate = Calendar.getInstance();
        return currentDate;
        
    }
       
//    
//    public Date getSpecificDateTime() {
//        //month is zero based...????
//        Date currentDate = new Date(2015-1900,0,1);
//        return currentDate;
//        
//    }
    
}
