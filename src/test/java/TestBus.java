import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBus {

    Bus bus;
    Person person;

    @Before
    public void before(){
        person = new Person();
        bus = new Bus("Ocean Terminal", 100);
    }

    @Test
    public void getPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void addPassenger(){
     bus.addPassenger(person);
     assertEquals(1, bus.getPassengers());
    }

//    @Test
//    public void
}
