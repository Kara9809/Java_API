package birthday_system;

import java.util.*;

import static birthday_system.BirthdayStatistics.*;

public class BirthdaySystemReminder extends Person {
    private Set<Person> people = new HashSet<Person>();
    private BirthdayTask birthdayTask;
    private static Scanner scanner;
    public BirthdaySystemReminder birthdaySystemReminder;

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean isMenuRunning = true;
        while (isMenuRunning) {
            System.out.println("\tWelcome to my Birthday program!\nPlease choose a task from the list below: \n");
            System.out.println("1. To add new person\n");
            System.out.println("2. To delete a person\n");
            System.out.println("3. To print all friends from my friend list\n");
            System.out.println("4. To print number of my Friends");
            System.out.println("5. To print the Happiest month");
            System.out.println("6. To print the Saddest month");
            System.out.println("7. To print all birthdays");
            System.out.println("8. To Exit from my Program");

            System.out.println("Please insert your choice from the menu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    people.add(this); //input from user???how to get it and to add to HashSet-?
                }
                case 2: {
                    people.remove(this); //how to get the input and delete it from the list?
                }
                case 3: {
                    System.out.println(people); //to print all friends+numbers from the set
                }
                case 4: {
                    System.out.println(people.size());  //to print number of friends
                }
                case 5: {
                    // החודש השמח – יש להדפיס את שם החודש עם הכי הרבה ימי הולדת.
                    getHappyMonth();
                }
                case 6: {
                    // החודש העצוב – יש להדפיס את שם החודש עם הכי מעט ימי הולדת.
                    getSadlyMonth();
                }
                case 7: {
                   // הדפסת אירועים – יש להדפיס רשימה של החודשים ומספר ימי ההולדת לכל חודש.
                    getEvents();
                }
                case 8: {
                    System.out.println("Exit Menu");
                    isMenuRunning = false;
                    break;
                }
            }
        }
    }

    public void startSystem() {
        //• המתודה startSystem תקיים גוף לולאה שיריץ את התפריט עד לקבלת זקיף יציאה
        for (int i = 0; i < ; i++) {
            
        }
    }

    public void endSystem() {
        //• המתודה endSystem תופעל עם היציאה ותדפיס: "תודה ולהתראות" ותסגור משאבים

    }

    public void addPerson(Person person) {
        //• המתודה addPerson תאתחל חבר באמצעות מחלקת העזר ותוסיף אותו לאוסף

    }

    public void deletePerson(int id) {
        //• המתודה deletePerson תסיר חבר מהרשימה ע"פ שדה id

    }

    public void printAll() {
        //• המתודה printAll תדפיס רשימה ממויינת - polymorphizm to Treeset??

    }
    public void printStatistics(){
        //• המתודה printStatistic תפעיל את כלל ההדפסות של המתודות הבאות
    }
    public void printCount(){
        //• המתודה printCount תדפיס כמות החברים שלי , למשל: "במערכת קיימים 2 חברים"
    }
    public void printHappyMonth(List<Person> people) {
        //המתודה printHappyMonth תדפיס את החודש שבו הכי הרבה ימי הולדת, בהנחה ויש
        //כמה כאלו, ניתן להציג אחד מהם.
    }
    public void printSadlyMonth(List<Person> people){
        //המתודה printSadlyMonth תדפיס את החודש שבו הכי מעט ימי הולדת, בהנחה ויש
        //כמה כאלו, ניתן להציג אחד מהם.
    }
    public void printEvents(List<Person> people){
        // המתודה printEvents – תדפיס עבור כל חודש, כמה ימי הולדת חוגגים בו.
        //o חודש 1 – 3 ימי הולדת
        //o חודש 2 – 0 ימי הולדת
        //... o
        //o חודש 12 – 4 ימי הולדת
    }


}
