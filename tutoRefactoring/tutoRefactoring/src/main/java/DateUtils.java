import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isaBoolean(startingDate, endingDate, now);

    }

    private static boolean isaBoolean(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }
}