package cs665.tbconde.finalProject.behavioralPatterns.state;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

public class ElectivesIneligible implements PossibleState {
    @Override
    public void enrollElective(Student student, Course course) {
        System.out.println("The student is not in the last year, it is not possible to enroll " +
                "in the " + course.getTitle() + " course at this moment.");
    }
}
