package ex_plane_23112023;

import java.util.Random;

public class Airplane implements Runnable {
    private final int airplaneId;
    private final int takeOfTime = (int) (Math.random() + 1000) + 500;
    private final int landingTime = (int) (Math.random() * 1000) + 500;
    private final int distanceTime = (int) (Math.random() * 1000) + 500;
    public static final Object mutes = new Object();


    public Airplane(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public void run() {
        takeOff();
        fly();
        land();
    }

    private void land() {
    }

    private void fly() {
        System.out.println("Plane #"+this.airplaneId+ " is flying for "+distanceTime+" ms");
    }

    private void takeOff() {
    }


}
