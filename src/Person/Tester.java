package Person;

public class Tester extends Person{
    public static void main(String[] args) {
        Person Karina = new Person();
        Karina.setName("Karina");
        Karina.setAge(25);
        Karina.setFavColor("Green");

        System.out.println("My name is " + Karina.getName());
        System.out.println("I am " + Karina.getAge() + " years old.");
        System.out.println("My favourite color is " + Karina.getFavColor());

        Person Kara = new Person("Ka", 4, "Blue");
        System.out.println(Kara.getName());
    }
}
