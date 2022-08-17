package cs665.tbconde.finalProject.behavioralPatterns.state;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

public class ElectivesEligible implements PossibleState {
    @Override
    public void enrollElective(Student student, Course course) {
        System.out.println("The student is in the last year, it is possible to enroll in an elective course.");
        course.enrollStudent(student);
    }
}
