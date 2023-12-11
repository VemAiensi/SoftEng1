public class HelpDesk {
    private String name;
    private Individual individual;
    private boolean processing;

    //outside instantation is required to make multiple Helpdesks
    public HelpDesk(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInProgress() {
        String report = "Waiting..";

        if (individual != null) 
            report = individual.getName();
        
            return report;
    }

    //process an individual
    public void process(Individual individual) {
        this.individual = individual;
        processing = true;
    } 
    

    public synchronized void endProcess() {
        individual = null;
        processing = false;
    }

    public Boolean getStatus() {
        return processing;
    }
}
