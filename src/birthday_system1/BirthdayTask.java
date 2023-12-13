package birthday_system1;

import java.time.LocalDate;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BirthdayTask implements Runnable {
    private Set<Person> people;

    public BirthdayTask(Set<Person> people) {
        this.people = people;
    }

    @Override
    public void run() {
        while (true) {
            for (Person p : people) {
                if (p.getBirthday().getMonthValue() == LocalDate.now().getMonthValue() && p.getBirthday().getDayOfMonth()
                        == LocalDate.now().getDayOfMonth() && !p.isGreeting()) {
                    if (p.isSpecial()) {
                        SpecialBirthdayTask specialBirthdayTask = new SpecialBirthdayTask(p);
                        Thread t1 = new Thread(specialBirthdayTask);
                        t1.setDaemon(true);
                        t1.start();
                        p.setGreeting(true);
                    } else {
                        System.out.println("Happy birthday " + p.getName());
                        p.setGreeting(true);
                    }
                }
            }
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
