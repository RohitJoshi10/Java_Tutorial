package Java8Features.NewDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeMethod {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        // availableZoneIds.forEach(System.out::println);

        // Custom ZondDateTime
        ZonedDateTime LondanKaTime = ZonedDateTime.of(2000,12,1,14,30,30,12,ZoneId.of("Europe/London"));
        System.out.println("London ka time: " + LondanKaTime);

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in India: " + indiaTime);
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in NewYork: " + newYorkTime);

        ZonedDateTime parsed = ZonedDateTime.parse("2023-04-23T10:30:00-04:00[America/New_York]");
        System.out.println(parsed);


    }
}


// ZonedDateTime: Represents a date and time without zone.
// UTC: Universal Time Coordinated. UTC stands for Coordinated Universal Time. It is a standard used to establish time zones worldwide. For example, New York City is in the UTC-5 time zone, which means the time in NYC is five hours behind UTC (except during U.S. daylight savings, when it is four hours behind).
// LocalDateTime doesn't consider the zone it considers the system date and time.