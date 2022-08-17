package cs665.tbconde.finalProject.structuralPatterns.composite.concentration;

import cs665.tbconde.finalProject.behavioralPatterns.observer.Observer;
import cs665.tbconde.finalProject.behavioralPatterns.observer.StudentObserver;
import cs665.tbconde.finalProject.behavioralPatterns.observer.Subject;
import cs665.tbconde.finalProject.behavioralPatterns.observer.WaitListNotificationSubject;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Faculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;

import java.util.ArrayList;

public class Course extends CourseComposite {
    int maxStudents = 20;
    ArrayList<Student> studentsEnrolled;
    String title;
    Faculty instructor;
    String description;
    String syllabus;
    Subject waitList;

    public Course(String title, Faculty instructor, String description, String syllabus ) {
        this.title = title;
        this.instructor = instructor;
        this.description = description;
        this.syllabus = syllabus;
        this.waitList = new WaitListNotificationSubject();
        this.studentsEnrolled = new ArrayList<Student>();
    }
    public Course(String title, Faculty instructor, String description, String syllabus, int maxStudents) {
        this(title, instructor, description,  syllabus );
        this.maxStudents = maxStudents;
    }
    @Override
    public HTMLOutput format() {
        System.out.print("\s\s-- " + this.title + " / instructed by: " + this.instructor + " / description: " +
                this.description + " / syllabus: " + this.syllabus + " / max number of students: "
                + this.maxStudents + "\n"
        );
        return null;
    }
    public void enrollStudent(Student student) {
        if (studentsEnrolled.size() == this.maxStudents) {
            Observer subscriber = new StudentObserver(student, waitList);
            String capacityReachedMessage = "Course capacity reached. You were added to the wait list. " +
                    "Your position: " + waitList.position(subscriber);
            subscriber.alert(capacityReachedMessage);
        } else {
            System.out.println("Enrolling student " + student.getName() + "in " + this.title);
            studentsEnrolled.add(student);
        }
    }
    public void dropStudent(Student student) {
        if (studentsEnrolled.contains(student)) {
            studentsEnrolled.remove(student);
        }
        if (studentsEnrolled.contains(student) && waitList.size() != 0) {
            String message = "--Enrolling next student in wait list--";
            StudentObserver nextInQueue = (StudentObserver)waitList.update(message);
            enrollStudent(nextInQueue.getStudent());
        }
    }

    public String getTitle() {
        return title;
    }
}
