import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class RussianDateParser implements Parseable {
    private DateTimeFormatter dateTimeFormatter;


    public RussianDateParser() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
    }


    public LocalDate parseDate(String date) {
        return LocalDate.parse(date, dateTimeFormatter);
    }
}