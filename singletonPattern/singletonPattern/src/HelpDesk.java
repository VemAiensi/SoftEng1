import java.util.ArrayList;

public class HelpDesk {
    private String name;
    private HelpDesk instance;
    private Individual individual;
    private boolean processing;
    private ArrayList<Individual> queue = new ArrayList<>();

    //outside instantation is required to make multiple Helpdesks
    public HelpDesk(String name){
        this.name = name;
    }

    //get helpDesk instance
    public synchronized HelpDesk getInstance(String name) {
        if (instance == null)
            instance = new HelpDesk(name);
        return instance;
    }
    
    public synchronized boolean qeued() {
        return processing;
    }

    //enQeue an individual
    public synchronized void process(Individual individual) {
        System.out.println("\n\t" + individual.getName() + " went to " + name);
        if(!processing){
            processing = true;
            this.individual = individual;
            System.out.println(this.individual.getName() + " is now processing his/her inquiry.");
        }
        else{
            System.out.println("Another individual is still inquiring.\n"+ individual.getName() +" is waiting for his/her turn.");          
            enQueue(individual);
            System.out.println(individual.getName() + "'s queue number is [" + queue.size() + "]");
        }
             
    }

    public synchronized void endProcess() {
        processing = false;
        System.out.println("\n" + this.individual.getName() + " has completed his/her inquiry.");
        
        if(queue.size() != 0){
            process(queue.get(0));
            deQueue(queue.get(0));
        }
        else
            System.out.println("[Notification] All in queue at "+ name + "\nhas finished their transaction");
    }

    //Qeue managing tools
    private void deQueue(Individual individual){
        queue.remove(individual);
        adjustQueueNum();
    }

    private void enQueue(Individual individual){
        queue.add(individual);
        queue.get(queue.size()-1).setQeueNum(queue.size());
    }

    private void adjustQueueNum(){
        for (int i = 0; i < queue.size(); i++){
            queue.get(i).setQeueNum(i+1);
        }
    }

    public void displayQueue(){
        System.out.println("\n\t_[" + name + "]_");
        System.out.println("In progress: " + this.individual.getName());
        System.out.println("\t..Queue..");
        for (Individual individual: queue){
            System.out.println("\t[" + individual.getQeueNum() + "] " + individual.getName());
        }
    }

    public void resetQueue(){
        queue.clear();
    }
}
