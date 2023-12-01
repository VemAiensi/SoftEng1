import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    private String newsHeadline;
    private String newsOverview;
    private List<Subscriber> subscribers = new ArrayList<>();

    //Setters & Getters
    public String getNewsHeadline() {
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline) {
        this.newsHeadline = newsHeadline;
    }

    public String getNewsOverview() {
        return newsOverview;
    }

    public void setNewsOverview(String newsOverview) {
        this.newsOverview = newsOverview;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    
    @Override
    public void attatch(Subscriber subscriber) {
        System.out.println(subscriber.getSubscriberName() + " is added to the subscriber list.");
        subscribers.add(subscriber);
    }

    @Override
    public void detatch(Subscriber subscriber) {
        System.out.println(subscriber.getSubscriberName() + " is removed from the subscriber list.");
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {

        String output = "";

        for(Subscriber subscriber : subscribers){
            output +=  "NEW Notification to: " + subscriber.getSubscriberName() + "\n";
            output += "Current news:\n\t" + newsHeadline + "\nOverview - \n\t" + newsOverview +"\n\n\n";
        }
        System.out.println(output);
    }

}
