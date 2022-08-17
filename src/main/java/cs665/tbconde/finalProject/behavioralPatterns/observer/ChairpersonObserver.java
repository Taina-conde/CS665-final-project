package cs665.tbconde.finalProject.behavioralPatterns.observer;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Chairperson;

public class ChairpersonObserver implements Observer {
    Chairperson chairperson= Chairperson.getInstance();
    Subject subject;

    public ChairpersonObserver( Subject s) {
        this.subject = s;
    }
    public void alert(String message) {
        chairperson.setNotification(message);
        chairperson.showNotifications();
    }
}
