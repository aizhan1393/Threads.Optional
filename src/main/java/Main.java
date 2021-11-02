import java.util.Arrays;
import java.util.List;

public class Main {
    static List<RunwayTripLock> runwayTripLocks = Arrays.asList(new RunwayTripLock("1"),
            new RunwayTripLock("2"),
            new RunwayTripLock("3"),
            new RunwayTripLock("4"),
            new RunwayTripLock("5")
    );

    public static void main(String[] args) {

            Plane plane1 = new Plane("plane1");
            Plane plane2 = new Plane("plane2");
            Plane plane3 = new Plane("plane3");
            Plane plane4 = new Plane("plane4");
            Plane plane5 = new Plane("plane5");
            Plane plane6 = new Plane("plane6");
            Plane plane7 = new Plane("plane7");
            Plane plane8 = new Plane("plane8");
            Plane plane9 = new Plane("plane9");
            Plane plane10 = new Plane("plane10");

            new Thread(()->plane1.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane2.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane3.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane4.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane5.takeOff(runwayTripLocks)).start();
            new Thread(() -> plane6.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane7.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane8.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane9.takeOff(runwayTripLocks)).start();
            new Thread(() ->plane10.takeOff(runwayTripLocks)).start();
   }
}
