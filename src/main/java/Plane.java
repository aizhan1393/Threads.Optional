import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Plane extends Thread{

    private String name;

    public Plane(String name) {
        this.name = name;
    }


    public String getPlaneName() {
        return name;
    }

    public void takeOff(List<RunwayTripLock> runwayTripLocks){
        for(RunwayTripLock runwayTrip: runwayTripLocks){
            if(!runwayTrip.isOccupied) {
                runwayTrip.takeOff();
            }
        }
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}
