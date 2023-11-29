package sleepy_thread;

import java.util.Random;

public class Sleepy extends Thread{
    public Random rnd = new Random();
    public Sleepy(String name){
        super(name);
        rnd = new Random();
    }
    public void run(){
        for (int i = 0; i <10 ; i++) {
            int sleepTime= rnd.nextInt(500)+500;
            System.out.println(getName()+ " i go to sleep for "+sleepTime+"ms (#"+(i+1)+")");
            try {
                sleep(sleepTime);
            } catch (InterruptedException e){
                System.out.println("i was interrupted");
            }
            System.out.println(getName()+" wakes up (#"+(i+1)+")");
        }
    }
}
