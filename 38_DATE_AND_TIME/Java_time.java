import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime l = LocalTime.now();
        System.out.println(l);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
    
}
