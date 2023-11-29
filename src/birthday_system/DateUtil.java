package birthday_system;

import java.time.LocalDate;

public class DateUtil extends Person {
    public static String BeautifyDate(LocalDate date) {
        return "dd/MM/yyyy";
    }

    @Override
    public String toString() {
        return "DateUtil{" +
                "dateTimeFormatter=" + dateTimeFormatter +
                "} " + super.toString();
    }
}
