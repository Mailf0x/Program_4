import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DanishDateParser implements Parseable {
    private DateTimeFormatter dateTimeFormatter;


    public DanishDateParser() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
    }


    public LocalDate parseDate(String date) {
        return LocalDate.parse(date, dateTimeFormatter);
    }
}
