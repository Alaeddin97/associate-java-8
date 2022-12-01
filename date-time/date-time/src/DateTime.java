import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2022, Month.NOVEMBER,20);
        System.out.println(localDate);
        localDate=localDate.plusDays(5);
        System.out.println(localDate);

        LocalTime localTime=LocalTime.of(9,10);
        System.out.println(localTime);
        localTime=localTime.plusHours(10).minusMinutes(60);
        System.out.println(localTime);

        LocalDateTime localDateTime=LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        localDateTime=localDateTime.plusWeeks(1);
        System.out.println(localDateTime);

        // before java 8
        Date date=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(2022,11,1);
        System.out.println(calendar.getTime());

    }
}
