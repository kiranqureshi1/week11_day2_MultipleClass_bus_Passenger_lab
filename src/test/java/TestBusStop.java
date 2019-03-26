import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBusStop {

        BusStop busStop;
        Person person1;

        @Before
        public void before(){
            person1 = new Person();
            busStop = new BusStop("Ocean Terminal");
        }

        @Test
        public void getQueueCount(){
            assertEquals(0, busStop.getQueueCount());
        }

    @Test
    public void addPersonToTheQueue(){
        busStop.addPersonToQueue(person1);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void removePersonFromQueue(){
            Person person2 = new Person();
            busStop.addPersonToQueue(person1);
            busStop.addPersonToQueue(person2);
            busStop.removePersonFromQueue(person2);
            assertEquals(1, busStop.getQueueCount());
    }



}
