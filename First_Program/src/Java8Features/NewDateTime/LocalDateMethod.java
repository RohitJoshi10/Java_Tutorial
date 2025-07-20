package Java8Features.NewDateTime;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateMethod {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // returns current date using system clock
        System.out.println(now);

        // Creating a custom object of Local Date
        LocalDate customDate = LocalDate.of(1998, 2, 7);
        System.out.println(customDate);
        int dayOfMonth = now.getDayOfMonth();
        int month = now.getMonthValue();
        int dayOfYear = now.getYear();

        System.out.println(dayOfYear + " : " + month + " : " + dayOfMonth);

        LocalDate today = LocalDate.now();
        LocalDate pastDate = today.minusMonths(1);
        System.out.println(pastDate);

        if(today.isAfter(today.minusDays(1))){
            System.out.println("Correct");
        }

    }

}


// LocalDate: Represents a date without a time zone.