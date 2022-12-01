import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2022, Month.DECEMBER,1);
        LocalTime localTime=LocalTime.of(9,55);
        LocalDateTime localDateTime=LocalDateTime.of(localDate,localTime);

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_TIME));

        DateTimeFormatter shortFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter fullFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println(localDateTime.format(shortFormatter));
        System.out.println(localDateTime.format(mediumFormatter));
        System.out.println(localDateTime.format(fullFormatter));

        DateTimeFormatter formatDateTimeCustomized=DateTimeFormatter.ofPattern("MMMM dd,yyyy, hh:mm");
        System.out.println(localDateTime.format(formatDateTimeCustomized));
    }
}
