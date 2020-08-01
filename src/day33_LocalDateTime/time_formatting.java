package day33_LocalDateTime;





import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time_formatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, MM/dd/yyyy");
        LocalDate ld = LocalDate.of(2020,07,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        //DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy")





    }


}
