import java.time.LocalDate;


public class Runner {
    private static LocalDate[] dates;
    private static int maxDelayDate;


    public static void main(String[] args) {
        System.out.println("This program reads dates format and a list of dates in this format from command line arguments and finds a date with max chronological delay with previous");
        Parseable dateParser = null;
        if ( args[0].compareTo("Russian") == 0 ) {
            dateParser = new RussianDateParser();
        } else if ( args[0].compareTo("USA") == 0 ) {
            dateParser = new USADateParser();
        } else if ( args[0].compareTo("Danish") == 0 ) {
            dateParser = new DanishDateParser();
        }
        dates = new LocalDate[args.length - 1];
        if (dateParser != null) {
            for (int i = 0; i != dates.length; i++) {
                dates[i] = dateParser.parseDate(args[i + 1]);
            }
            DateSorter.sortDates(dates);
            maxDelayDate = MaxDelayFinder.findMaxDelay(dates);
            System.out.println("Max delay date is " + dates[maxDelayDate]);
        } else {
            System.out.println("ERROR: UNKNOWN FORMAT");
        }
    }
}
