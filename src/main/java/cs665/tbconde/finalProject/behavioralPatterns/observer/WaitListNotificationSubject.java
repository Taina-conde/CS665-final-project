package cs665.tbconde.finalProject.behavioralPatterns.observer;


import java.util.LinkedList;

public class WaitListNotificationSubject implements Subject {
    private Observer fixedObserver;
    private LinkedList<Observer> observersQueue;
    private String message;
    public WaitListNotificationSubject() {
        observersQueue = new LinkedList<>();
        fixedObserver = new ChairpersonObserver(this);
    }

    public Observer enrollNext(String message) {
        this.message = message;
        Observer nextInQueue = observersQueue.getFirst();
        this.notifySubscribers();
        this.unsubscribe(nextInQueue);
        return nextInQueue;
    }

    @Override
    public void updateMessage(String message) {
        this.message = message;
        this.notifySubscribers();
    }

    @Override
    public void subscribe(Observer o) {
        observersQueue.addLast(o);
    }

    public void unsubscribe() {
        observersQueue.poll();
    }
    @Override
    public void unsubscribe(Observer o) {
        observersQueue.remove(o);
    }

    @Override
    public void notifySubscribers() {
        fixedObserver.alert(this.message);
        for (Observer o : observersQueue) {
            o.alert(this.message);
        }
    }
    @Override
    public int position(Observer o) {
        return observersQueue.indexOf(o) + 1;
    }

    @Override
    public int size() {
        return this.observersQueue.size();
    }
}
