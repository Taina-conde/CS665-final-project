package cs665.tbconde.finalProject.behavioralPatterns.observer;

public interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void updateMessage(String message);
    void notifySubscribers();
    Observer enrollNext(String message);
    int position(Observer o);
    int size();
}
