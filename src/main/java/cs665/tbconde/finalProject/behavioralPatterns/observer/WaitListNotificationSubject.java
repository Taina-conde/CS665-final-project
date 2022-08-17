package cs665.tbconde.finalProject.behavioralPatterns.observer;

import java.util.ArrayList;

public class WaitListNotificationSubject implements Subject {
    private ArrayList<Observer> observers;
    private String message;
    public WaitListNotificationSubject() {
        observers = new ArrayList<Observer>();
    }

    public Observer update(String message) {
        this.message = message;
        Observer nextInQueue = observers.get(0);
        this.unsubscribe(nextInQueue);
        this.notifySubscribers();
        return nextInQueue;
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifySubscribers() {
        for (Observer o : observers) {
            o.alert(this.message);
        }
    }
    @Override
    public int position(Observer o) {
        return observers.indexOf(o) + 1;
    }

    @Override
    public int size() {
        return this.observers.size();
    }
}
