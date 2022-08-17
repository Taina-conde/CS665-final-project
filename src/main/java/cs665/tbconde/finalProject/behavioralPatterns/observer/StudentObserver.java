package cs665.tbconde.finalProject.behavioralPatterns.observer;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;

public class StudentObserver implements Observer{
    Student student;
    String message;
    Subject subject;
    public StudentObserver(Student student, Subject s) {
        this.student = student;
        this.subject = s;
        this.subject.subscribe(this);
    }
    public void alert(String message) {
        this.message = message;
        display();
    }
    public Student getStudent() {return this.student;}
    private void display() {
        System.out.println("\s\s\s Message received by Student " + this.student.getName() + " : " + this.message);
    }
}
