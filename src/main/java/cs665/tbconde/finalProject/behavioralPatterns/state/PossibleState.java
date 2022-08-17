package cs665.tbconde.finalProject.behavioralPatterns.state;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

public interface PossibleState {
    void enrollElective(Student student, Course course);
}
