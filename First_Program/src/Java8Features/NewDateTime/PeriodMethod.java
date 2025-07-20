package Java8Features.NewDateTime;

import java.time.*;

public class PeriodMethod {
    public static void main(String[] args) throws InterruptedException {
//        Instant start = Instant.now();
//        Instant end = Instant.now();
//        Duration duration = Duration.between(start, end);
//        LocalDateTime a = LocalDateTime.now();
//        Thread.sleep(2000);
//        LocalDateTime b = LocalDateTime.now();
//        Duration duration1 = Duration.between(a,b);
//        System.out.println(duration1);

        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1998, 12, 25);
        Period period = Period.between(now, then);
        System.out.println(period);


    }
}

// Period: Represents a period of time between two dates.
// Jab badi date ya time aa jata hai tab hum duration use na krke period use krte hai.
