package datetimeapi;

import java.time.*;
import java.util.Set;

public class DateDemo2 {
    public static void main(String[] args) {
        //Date arithmetic
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate dateAfterOneYearAndHalf = LocalDate.now().plusYears(1).plusMonths(6);
        System.out.println(dateAfterOneYearAndHalf);

        LocalDateTime dateTimeBefore5Hr30Min = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println(dateTimeBefore5Hr30Min);


        //Time Zone
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds);

        LocalDateTime currentTimeInLosAngeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(currentTimeInLosAngeles);// current (local) time in Los Angeles

        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime la = ZonedDateTime.of(localDateTime,losAngeles);
        System.out.println(la);

        //Time Stamp
        Instant thisInstant = Instant.now();
        System.out.println(thisInstant);

    }
}
