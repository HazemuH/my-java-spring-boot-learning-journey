import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeHandling{

    public static void main(String[] args) {
        // Date and Time Handling: Understand how to work with date and time

        // Using java.util.Date (Legacy)
        // Create a Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time (java.util.Date): " + currentDate);

        // Using java.time (Modern)
        // LocalDate represents a date (year, month, day)
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date (java.time.LocalDate): " + localDate);

        // LocalTime represents a time (hour, minute, second)
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time (java.time.LocalTime): " + localTime);

        // LocalDateTime represents both date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time (java.time.LocalDateTime): " + localDateTime);

        // Formatting dates using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parsing dates from strings
        String dateStr = "2023-10-10";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("Parsed Date (from string): " + parsedDate);

        String timeStr = "15:30:00";
        LocalTime parsedTime = LocalTime.parse(timeStr);
        System.out.println("Parsed Time (from string): " + parsedTime);

        // Calculate future date
        LocalDate futureDate = localDate.plusDays(7);
        System.out.println("Future Date (7 days from now): " + futureDate);

        // Calculate past date
        LocalDate pastDate = localDate.minusMonths(2);
        System.out.println("Past Date (2 months ago): " + pastDate);
    }
}