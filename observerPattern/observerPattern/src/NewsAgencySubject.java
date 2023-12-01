public interface NewsAgencySubject {
    public void attatch(Subscriber subscriber);
    public void detatch(Subscriber subscriber);
    public void notifySubscribers();
}
