package birthday_system;


import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Getter
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private LocalDate Birthday;
    private static final int counter = 1;

    public Person() {
        this.id = counter;
        this.name = name + counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(Birthday, person.Birthday) && Objects.equals(dateTimeFormatter, person.dateTimeFormatter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Birthday, dateTimeFormatter);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Birthday=" + Birthday +
                ", dateTimeFormatter=" + dateTimeFormatter +
                '}';
    }
}
