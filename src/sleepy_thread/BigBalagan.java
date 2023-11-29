package sleepy_thread;

import java.util.Objects;

public class BigBalagan extends Thread {
    private static int counter = 0;
    private static Object theMutex = new Object();


    public void run() {
        synchronized (theMutex) {
            System.out.println(currentThread().getName() +
                    " before inc: counter=" + counter);
            counter++;
            System.out.println(currentThread().getName() +
                    " after inc: counter=" + counter);
        }
    }

    public static void main(String[] args) {
        BigBalagan[] balaganArray = new BigBalagan[10];
        for (int i = 0; i < balaganArray.length; i++) {
            balaganArray[i] = new BigBalagan();
            balaganArray[i].start();
        }
    }
}
