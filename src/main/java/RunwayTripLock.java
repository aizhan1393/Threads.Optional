import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class RunwayTripLock {
    private String name;
    public boolean isOccupied = false;
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();


    public String getName(){
        return name;
    }


    public RunwayTripLock(String name) {
        this.name = name;
    }

    public void takeOff(){
        try {
            if (lock.tryLock()) {
                isOccupied = true;
                System.out.println("Plane began entering the runway trip!");
                System.out.println("The runway trip " + getName() + " has taken the plane");
                TimeUnit.SECONDS.sleep(3);
            }
            else {
                lock.tryLock(3, TimeUnit.SECONDS);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("The plane has taken off");
            System.out.println("The runway trip " + getName() + " is free");
            isOccupied = false;
            lock.unlock();
        }

    }
}
