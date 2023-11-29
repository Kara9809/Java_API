package homework_22_11_2023;

public class Jump_clap extends Thread {
    //      Create 2 Thread first thread is jumping and second thread is clapping (10 claps and 10 jumps)
    //      I want you to synchronize between them aka jump, clap, jump, clap...
    // Two threads performing two tasks at a time.
    // Declare a String variable to represent task.
    String task;

    public Jump_clap(String task) {
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(task);
            try {
                Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        } // end of for loop.
    } // end of run() method.

    public static void main(String[] args) {
// Create two objects to represent two tasks.
        Jump_clap th1 = new Jump_clap("Jump"); // Passing task as an argument to its constructor.
        Jump_clap th2 = new Jump_clap("Clap");

// Create two objects of Thread class and pass two objects as parameter to constructor of Thread class.
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();
    }
}

