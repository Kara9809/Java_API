package birthday_system;

import java.util.HashSet;
import java.util.Set;

public class BirthdayTask implements Runnable{
    private Set<Person> people = new HashSet<Person>();
    //+ReminderTask(Set<Person>) -?
    @Override
    public void run() {

    }
    //הנחיות:
    //• התהליכון BirthdayTask מתחיל לרוץ עם עליית המערכת כל 24 שעות ובודק למי יש
    //באותו היום יום הולדת
    //• בכל ריצה שלו הוא מדפיס הודעה עבור כל חבר שמציין היום את יום הולדתו
    //• למשל: "משה חוגג היום יום הולדת – הוא נולד בתאריך 03/25/1995"
    //• התהליך אמור להסתיים עם סיום התוכנה
    //איך לבדוק שזה עובד?
    //• לשנות את זמן המנוחה של המתודה run לדקה אחת במקום 24 שעות.
    //• יש להזין חבר עם התאריך של היום
}
