package datetimeapi;

import java.time.*;

public class DateDemo1 {
    public static void main(String[] args) {

        //Date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// yyyy-MM-dd

        LocalDate valentinesDay = LocalDate.of(2018, Month.FEBRUARY, 14);
        System.out.println(valentinesDay);

        LocalDate dayInYear = LocalDate.ofYearDay(2018, 123);
        System.out.println(dayInYear);

        LocalDate myDoj = LocalDate.of(2014, 6, 9);
        boolean isBefore = LocalDate.now().isAfter(myDoj);
        System.out.println(isBefore);

        Month firstMonth = currentDate.getMonth().firstMonthOfQuarter();
        System.out.println(firstMonth);

        boolean leapYear = currentDate.isLeapYear();
        System.out.println(leapYear);


        //Time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime goodTime = LocalTime.of(10, 30);
        System.out.println(goodTime);

        LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(85240);
        System.out.println(fromSecondsOfDay);


        //DateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime secondAug2018 = LocalDateTime.of(2018, 10, 2, 12, 30);
        System.out.println(secondAug2018);


        LocalTime nowInUtc = LocalTime.now(Clock.systemUTC()); //Coordinated Universal Time
        System.out.println(nowInUtc);

        //Year
        Year currentYear = Year.now();
        System.out.println(currentYear);

        LocalDate dateOf1992Day65 = Year.of(1992).atDay(65);
        System.out.println(dateOf1992Day65);
    }
}
