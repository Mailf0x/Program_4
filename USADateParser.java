import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class USADateParser implements Parseable {
    private DateTimeFormatter dateTimeFormatter;


    public USADateParser() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
    }


    public LocalDate parseDate(String date) {
        return LocalDate.parse(date, dateTimeFormatter);
    }
}