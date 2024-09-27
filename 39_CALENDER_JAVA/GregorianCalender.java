import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calender.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calender.MINUTE) + ":" + c.get(Calender.SECOND));
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2021));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
    
}
