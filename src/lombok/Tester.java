package lombok;

public class Tester {
    public static void main(String[] args) {
        PersonSimple personSimple = new PersonSimple("Karina", 25, false, "Rishon", true, 10_000, false);
        System.out.println(personSimple);
        personSimple.getName();
        System.out.println(personSimple.getName());
    }
}
