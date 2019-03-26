import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int getQueueCount(){
        return this.queue.size();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public void removePersonFromQueue(Person person){
        this.queue.remove(person);
    }

    public Person removePersonFromQueueToBus(Person person){
        this.queue.remove(person);
        return person;
    }




}
