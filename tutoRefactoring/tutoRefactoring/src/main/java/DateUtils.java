import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isaBoolean(startingDate, endingDate, LocalDate.now());

    }

    private static boolean isaBoolean(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }

    private static void isDateOutsider(LocalDate date, LocalDate startingDate, LocalDate
            endingDate) {
        return !DateUtils.isDateBetween(date, startingDate, endingDate);
    }
}