package birthday_system1;

import java.time.LocalDate;

public class DateFactory {
    public static LocalDate getLocalDate(){
        int day = (int)(Math.random()*28)+1; //1-28
        int month = (int)(Math.random()*12)+1; //1-12
        int year = (int)(Math.random()*51)+1960; // 1960-2010
        return LocalDate.of(year,month,day);
    }
}
