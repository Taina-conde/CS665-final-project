package cs665.tbconde.finalProject.structuralPatterns.decorator;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;

public class UndergraduateAdvisor extends AdvisorDecorator{
    public UndergraduateAdvisor(FullTimeFaculty faculty) {
        this.faculty = faculty;
    }
    @Override
    public String getDescription() {
        return "Undergraduate Advisor: " + this.faculty.getName() ;
    }
}
