package datetimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateDemo3 {
    public static void main(String[] args) {
        LocalDate doj = LocalDate.of(2014, 06, 9);
        LocalDate today = LocalDate.now();

        //Period
        Period myExp = Period.between(doj, today);
        System.out.println(myExp);
        System.out.println(myExp.getYears() + "years " + myExp.getMonths() + "months " + myExp.getDays() + "days");

        Period twoAndHalfMonths = Period.ofMonths(2).plusDays(15);
        LocalDate dateOfSubs = LocalDate.of(2018,02,15);
        LocalDate endDateOfSubs = dateOfSubs.plus(twoAndHalfMonths);
        System.out.println(endDateOfSubs);

        //Duration
        Instant firstInstant = Instant.ofEpochSecond(doj.toEpochDay());
        Instant secondInstant = Instant.ofEpochSecond(today.toEpochDay());
        Duration duration = Duration.between(firstInstant, secondInstant);
        System.out.println(duration);
        System.out.println(duration.toDays()+"Days / "+duration.toHours()+"Hours / "+duration.toMinutes()+"Minutes ");


        //format
        LocalDateTime now = LocalDateTime.now();
        String ddMMyyyyHHmmss = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(ddMMyyyyHHmmss);

        String ddMMyyyyhhmma = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a"));
        System.out.println(ddMMyyyyhhmma);

        String yyyyMMddHHmmssS = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssS"));
        System.out.println(yyyyMMddHHmmssS);

        String ddMMyyyy = now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(ddMMyyyy);

        //parsing
        LocalDate dob = LocalDate.parse("11-20-1989",DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println(dob);
    }
}
