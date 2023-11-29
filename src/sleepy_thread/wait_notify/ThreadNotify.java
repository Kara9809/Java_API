package sleepy_thread.wait_notify;

public class ThreadNotify extends Thread {
    private ThreadWaiting threadWaiting;

    public ThreadNotify(ThreadWaiting threadWaiting) {
        this.threadWaiting = threadWaiting;
    }

    public void run() {
        System.out.println(getClass().getName() + " is going to sleep");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getClass().getName() + " tell to stop wait");
        synchronized (threadWaiting) {
            threadWaiting.notify();
        }
    }

}
