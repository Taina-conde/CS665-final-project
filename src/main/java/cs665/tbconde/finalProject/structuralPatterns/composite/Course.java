package cs665.tbconde.finalProject.structuralPatterns.composite;

import cs665.tbconde.finalProject.behavioralPatterns.observer.*;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Faculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;

import java.util.ArrayList;

public class Course extends CourseComposite {
    int maxStudents = 20;
    ArrayList<Student> studentsEnrolled;
    Faculty instructor;
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
        System.out.println("Enrolling student " + student.getName() + " in " + this.title);
        if (studentsEnrolled.size() >= this.maxStudents) {
            Observer subscriber = new StudentObserver(student, waitList);
            String capacityReachedMessage = "Enrollment failed. " + this.title +  " course capacity reached. " +
                    student.getName() + " added to the wait list. " +
                    student.getName() + " position: " + waitList.position(subscriber);
            waitList.updateMessage(capacityReachedMessage);
        } else {
            String successfulMessage = "\s\s\s" +student.getName() + " successfully enrolled in " + this.title;
            studentsEnrolled.add(student);
            student.addCourseTaken(this);
            System.out.println(successfulMessage);
        }
    }
    public void dropStudent(Student student) {
        if (studentsEnrolled.contains(student)) {
            studentsEnrolled.remove(student);
        }
        if ( waitList.size() != 0) {
            System.out.println("--Enrolling next student in wait list--");
            String message = "New opening in course " + title + "... Enrolling next student in wait list ";
            StudentObserver nextInQueue = (StudentObserver)waitList.enrollNext(message);
            enrollStudent(nextInQueue.getStudent());
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
}
