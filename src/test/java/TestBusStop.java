import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBusStop {

        BusStop busStop;

        @Before
        public void before(){
            busStop = new BusStop("Ocean Terminal");
        }

        @Test
        public void getQueueCount(){
            assertEquals(0, busStop.getQueueCount());
        }
}
