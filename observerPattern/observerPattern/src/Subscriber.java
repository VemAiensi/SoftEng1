public class Subscriber implements SubscriberObserver{
    
    private String subscriberName;

    Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName(){
        return subscriberName;
    }

    @Override
    public void update(NewsAgency news) {
       
        
    }
}
