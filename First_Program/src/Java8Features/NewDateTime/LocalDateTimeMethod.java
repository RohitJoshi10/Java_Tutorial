package Java8Features.NewDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMethod {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Custom LocalDateTime also work here
        LocalDateTime cutomDateTime = LocalDateTime.of(2002,06,10,11,50,58);
        System.out.println(cutomDateTime);

        LocalDateTime paredDateTime= LocalDateTime.parse("2023-01-11T13:48:40");
        System.out.println(paredDateTime);

        // Same minus plus operation you can perform here also.

    }
}

// LocalDateTime: Represents a date and time without a time zone.