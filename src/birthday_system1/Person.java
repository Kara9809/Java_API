package birthday_system1;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private LocalDate birthday;
    private static int counter = 1;
    private boolean isGreeting;
    private boolean isSpecial;

    public Person() {
        this.id = counter;
        this.name = "Person " + counter;
        counter++;
        this.birthday = DateFactory.getLocalDate(); //random birthday
        this.isGreeting = false;
        this.isSpecial = new Random().nextBoolean();
    }

    public Person(int id, String name, LocalDate birthday, boolean isSpecial) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.isSpecial = isSpecial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isGreeting() {
        return isGreeting;
    }

    public void setGreeting(boolean greeting) {
        isGreeting = greeting;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + DateUtil.BeautifyDate(this.birthday) +
                ", isGreeting=" + isGreeting +
                ", isSpecial=" + isSpecial +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.getBirthday().compareTo(p.getBirthday());
    }
}
