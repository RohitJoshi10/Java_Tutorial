package Java8Features.NewDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMethod {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customTime = LocalTime.of(14,30,30);
        System.out.println(customTime);

        String timeInString = "15:30:45";
        LocalTime parsedTime = LocalTime.parse(timeInString);
        System.out.println(parsedTime);

        LocalTime beforeOneHour = now.minusHours(1);
        System.out.println(beforeOneHour);

        if(now.isAfter(beforeOneHour)){
            System.out.println("Correct");
        }else System.out.println("Incorrect");
    }
}

// LocalTime: Represents a time without a date or time zone.