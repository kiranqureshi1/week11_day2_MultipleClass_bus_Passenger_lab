import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if (this.getPassengers() < capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person passenger){
        passengers.remove(passenger);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePersonFromQueueToBus();
     this.passengers.add(person);
    }




}
