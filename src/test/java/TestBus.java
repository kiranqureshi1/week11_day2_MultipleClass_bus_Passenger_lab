import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBus {

    Bus bus;
    Person person1;
    BusStop busStop;

    @Before
    public void before(){
        person1 = new Person();
        busStop = new BusStop("Ocean Terminal");
        bus = new Bus("Ocean Terminal", 100);
    }

    @Test
    public void getPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void addPassenger(){
     bus.addPassenger(person1);
     assertEquals(1, bus.getPassengers());
    }

    @Test
    public void removePassengerFromTheBus(){
        Person person2 = new Person();
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger(person2);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void pickUpPassenger(){
        Person person2 = new Person();
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
        bus.pickUp(busStop);
        assertEquals(1, bus.getPassengers());
        assertEquals(1,busStop.getQueueCount());
    }


}
