package cs665.tbconde.finalProject.structuralPatterns.decorator;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;

public class GraduateAdvisor extends AdvisorDecorator{
    public GraduateAdvisor(FullTimeFaculty faculty) {
        this.faculty = faculty;
    }
    @Override
    public String getDescription() {
        return "Graduate Advisor: " + this.faculty.getName() ;
    }
}
