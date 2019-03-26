import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBus {

    Bus bus;
    Person person1;

    @Before
    public void before(){
        person1 = new Person();
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
}
