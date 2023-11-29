package sleepy_thread.wait_notify;

public class ThreadWaiting extends Thread {
    public void run() {
        System.out.println(getClass().getName() + " me waiting");
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all is good, me continue to work");
    }
}
