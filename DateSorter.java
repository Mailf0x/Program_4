import java.time.LocalDate;


public class DateSorter {
    public static void sortDates(LocalDate dates[]) {
        LocalDate temp = null;
        for(int i = 0; i != dates.length; i++) {
            for(int j = 0; j != dates.length - 1; j++) {
                if( dates[j].isAfter(dates[j + 1]) ) {
                    temp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = temp;
                }
            }
        }
    }
}
