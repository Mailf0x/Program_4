import java.time.LocalDate;


public class MaxDelayFinder {
    public static int compare(LocalDate dateA, LocalDate dateB) {
        int result = 0;
        LocalDate temp = LocalDate.parse( dateA.toString() );
        if ( temp.isAfter(dateB) ) {
            while ( temp.isAfter(dateB) ) {
                temp = temp.minusDays(1);
                ++result;
            }
        } else if ( temp.isBefore(dateB) ) {
            while ( temp.isBefore(dateB) ) {
                temp.plusDays(1);
                --result;
            }
        }
        return result;
    }


    public static int findMaxDelay(LocalDate dates[]) {
        int result = 0;
        int delays[] = new int[dates.length - 1];
        for (int i = 0; i != dates.length - 1; i++) {
            delays[i] = compare(dates[i + 1], dates[i]);
        }
        result = 0;
        for (int i = 0; i != delays.length; i++) {
            if (delays[i] > delays[result]) {
                result = i;
            }
        }
        ++result;
        return result;
    }
}
