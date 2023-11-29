package sleepy_thread;

public class Tester {
    public static void main(String[] args) {

        Sleepy sleeper1 = new Sleepy("Karina");
        Sleepy sleeper2 = new Sleepy("Moshe");
        sleeper1.start();
        sleeper2.start();
    }
}
