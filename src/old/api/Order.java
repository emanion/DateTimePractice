

package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emanion
 */
public class Order {
    private Date orderDate;
    private Date dateTwo;
    private Calendar orderDateCal;
    private Calendar dateTwoCal;

    public Order() {
        orderDateCal= Calendar.getInstance();
        dateTwoCal= Calendar.getInstance();
    }
    
    
    public String getFormattedDate(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(orderDate);
    }
    
    public void setOrderDateFromString(String dateValue, String format) 
                 throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        orderDate = sdf.parse(dateValue);
    }
    public String getFormattedDateTwo(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dateTwo);
    }
    
    public void setDateTwoFromString(String dateValue, String format) 
                 throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        dateTwo = sdf.parse(dateValue);
    }
    
    public void setOrderDateCal(){
        orderDateCal.setTime(orderDate);
    }
    
    
    public void setDateTwoCal(){
        dateTwoCal.setTime(orderDate);
    }
    
    public long getDaysDiff(){
        long startMsec = orderDateCal.getTimeInMillis();
        long endMsec = dateTwoCal.getTimeInMillis();
        long diff = endMsec - startMsec;
        long days = diff/1000/60/60/24;
        return days;
    }
    
    

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDateTwo() {
        return dateTwo;
    }

    public void setDateTwo(Date dateTwo) {
        this.dateTwo = dateTwo;
    }

    public Calendar getOrderDateCal() {
        return orderDateCal;
    }

    public void setOrderDateCal(Calendar orderDateCal) {
        this.orderDateCal = orderDateCal;
    }

    public Calendar getDateTwoCal() {
        return dateTwoCal;
    }

    public void setDateTwoCal(Calendar dateTwoCal) {
        this.dateTwoCal = dateTwoCal;
    }
    
    
}
