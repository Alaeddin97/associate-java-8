import java.time.LocalDate;
import java.time.Period;

public class UsingPeriodClass {

    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2020,1,1);
        LocalDate end=LocalDate.of(2022,1,1);

        Period period=Period.of(0,6,0);

        while(start.isBefore(end)){
            System.out.println("Stay tuned !, it is "+start);
            start=start.plus(period);
        }
        System.out.println();
        System.out.println("YOHOOOOOOOOOOO HERE WE ARE YY!");
    }
}
