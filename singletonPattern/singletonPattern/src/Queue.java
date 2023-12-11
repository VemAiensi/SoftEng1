import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Queue{

    private static Queue instance;
    private AtomicInteger queueNum;
    private ArrayList <Individual> queue;

    private Queue() {
        queueNum = new AtomicInteger(1);
        queue = new ArrayList<>();
    }

    //get singleton instance: prevent outside/multiple instantiation
    public static synchronized Queue getInstance() {
        if (instance == null)
            instance = new Queue();
        return instance;
    }
    
    public int generateQueueNum() {
        return queueNum.getAndIncrement();
    }

    public Individual process(){
        Individual toProcess = queue.get(0);
        queue.remove(0);

        return toProcess;
    }

    public void enQueue(Individual individual){
        queue.add(individual);
        queue.get(queue.size()-1).setQeueNum(generateQueueNum());
    }

    public void resetQueue(){
        queue.clear();
    }

    public void displayQueue(ArrayList<HelpDesk> helpDesks){
        System.out.println("\n\t_[ INPROGRESS ]_");
        for (HelpDesk helpDesk: helpDesks){
            System.out.println( helpDesk.getName() + ": " + helpDesk.getInProgress() + "\n");
        }

        System.out.println("\t..Queue..");
        for (Individual individual: queue){
            System.out.println("\t[" + individual.getQeueNum() + "] " + individual.getName());
        }
    }

    public ArrayList<Individual> getQueue() {
        return queue;
    }
}