package birthday_system;

import java.time.LocalDate;
import java.util.Random;

public class DateFactory {
    public static LocalDate getLocalDate;

    public LocalDate getLocalDate() {
        Random ry = new Random();
        Random rm = new Random();
        Random rd = new Random();
        int year = 1960 + ry.nextInt(2010 - 1959 + 1);
        int month = 1 + rm.nextInt(12);
        int day = 1 + rm.nextInt(31);

        if (month == 2 && day > 28) {
            day = day - 3;
        } else {
            if ((month % 2 == 0 && month != 8) && day == 31) {
                day = day - 1;
            }
        }
        return null;
    }
}


