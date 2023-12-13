package birthday_system1;

import java.util.concurrent.TimeUnit;

public class SpecialBirthdayTask implements Runnable {
    private Person person;

    public SpecialBirthdayTask(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Special happy birthday to " + person.getName());
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
