import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parse {
    public static void main(String[] args) {

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM dd,yyyy");
        LocalDate localDate= LocalDate.parse("12 01,2022",formatter);
        System.out.println(localDate);
        System.out.println(localDate.format(formatter));

    }
}
