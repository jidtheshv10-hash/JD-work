import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : " + date);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date & Time : " + dateTime);

        // Day of Week
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day : " + day);

        // Month
        Month month = date.getMonth();
        System.out.println("Month : " + month);

        // Year
        int year = date.getYear();
        System.out.println("Year : " + year);

        // Day of Month
        System.out.println("Day of Month : " + date.getDayOfMonth());

        // Day of Year
        System.out.println("Day of Year : " + date.getDayOfYear());

        // Month Number
        System.out.println("Month Number : " + date.getMonthValue());

        // Leap Year
        System.out.println("Leap Year : " + date.isLeapYear());

        // Current Year
        Year currentYear = Year.now();
        System.out.println("Current Year : " + currentYear);

        // Time Zone
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time Zone : " + india);

        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("USA Time Zone : " + usa);

        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("London Time Zone : " + london);

        // Custom Date Format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = dateTime.format(formatter);
        System.out.println("Formatted Date & Time : " + formatted);

        // Add Days
        LocalDate nextWeek = date.plusDays(7);
        System.out.println("After 7 Days : " + nextWeek);

        // Subtract Days
        LocalDate previousWeek = date.minusDays(7);
        System.out.println("Before 7 Days : " + previousWeek);

        // Add Months
        System.out.println("After 2 Months : " + date.plusMonths(2));

        // Add Years
        System.out.println("After 1 Year : " + date.plusYears(1));

        // Compare Dates
        LocalDate future = LocalDate.of(2030, 1, 1);

        if (future.isAfter(date)) {
            System.out.println("2030 is in the Future.");
        }

        // Date Components
        System.out.println("Year  : " + date.getYear());
        System.out.println("Month : " + date.getMonth());
        System.out.println("Date  : " + date.getDayOfMonth());

        // Time Components
        System.out.println("Hour   : " + time.getHour());
        System.out.println("Minute : " + time.getMinute());
        System.out.println("Second : " + time.getSecond());
        System.out.println("Nano   : " + time.getNano());

        // End Message
        System.out.println("\n===== Date and Time Program Completed =====");
    }
}