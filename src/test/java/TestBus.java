import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBus {

    Bus bus;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 100);
    }

    @Test
    public void getPassengers(){
        assertEquals(0, bus.getPassengers());
    }
}
