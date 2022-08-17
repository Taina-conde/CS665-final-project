package cs665.tbconde.finalProject.structuralPatterns.decorator;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;

public class ThesisAdvisor extends AdvisorDecorator{
    Student studentAdvising;
    public ThesisAdvisor(FullTimeFaculty faculty, Student student) {
        this.faculty = faculty;
        this.studentAdvising = student;
    }

    @Override
    public String getDescription() {
        return "Thesis Advisor: " + this.faculty.getName() + "/ Student: " + studentAdvising.getName();
    }
}
