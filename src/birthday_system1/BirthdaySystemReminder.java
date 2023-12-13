package birthday_system1;

import java.util.*;

public class BirthdaySystemReminder {
    private Set<Person> people;
    private BirthdayTask task;

    public BirthdaySystemReminder() {
        this.people = new HashSet<>();
        this.task = new BirthdayTask(people);
        Thread t1 = new Thread(task);
        t1.setDaemon(true);
        t1.start();
    }

    public void showMenu() {
        System.out.println("1. To add a Person");
        System.out.println("2. To delete a Person");
        System.out.println("3. Print all people with a sort");
        System.out.println("4. To exit from the system");
    }

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            showMenu();
            System.out.println("Please enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    people.add(new Person());
                    break;
                }
                case 2: {
                    System.out.println("Please insert id of person to remove");
                    int id = scanner.nextInt();
                    Person personToRemove = null;
                    for (Person p : people) {
                        if (p.getId() == id) {
                            personToRemove = p;
                            break;
                        }
                    }
                    if (personToRemove == null) {
                        System.out.println("No person with this id: " + id + " founded");
                    } else {
                        people.remove(personToRemove);
                    }
                    break;
                }
                case 3: {
                    List<Person> sortedPeople = new ArrayList<>(people);
                    Collections.sort(sortedPeople);
                    for (int i = 0; i < sortedPeople.size(); i++) {
                        System.out.println(sortedPeople.get(i));
                    }
                    break;
                }
                case 4: {
                    System.out.println("Thank You and Good bye");
                    break;
                }
            }
        }
    }
}
