package Java8Features.NewDateTime;

import java.time.Instant;

public class InstantMethod {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); // It tells us from Jan 1 1970 UTC how many millisecond ho gye hai.

        Instant now = Instant.now(); // It gives us nano sec from Jan 1 1970 till now.
        System.out.println(now);

    }
}

// Instant: Represents an instantaneous point on the timeline, typically used for machine timestamps.