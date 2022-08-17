package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.behavioralPatterns.observer.Observer;
import cs665.tbconde.finalProject.behavioralPatterns.observer.Subject;
import cs665.tbconde.finalProject.behavioralPatterns.observer.WaitListNotificationSubject;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class Chairperson extends Faculty {
    private final int MAX_SIZE = 1;
    private final String notificationHeader= "\s\s\s Message received by Chairperson : " ;
    String notification;
    private static Chairperson uniqueInstance;
    private Chairperson() {
        super.coursesTeaching = new ArrayList<Course>(MAX_SIZE);
        super.maxNumCourses = MAX_SIZE;

    }
    public static synchronized Chairperson getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Chairperson();
        }
        return uniqueInstance;
    }


    public synchronized void setNotification(String notification) {
        this.notification = notification;
    }
    public synchronized void showNotifications()  {
        System.out.println(notificationHeader + notification);
    }
}
