package cs665.tbconde.finalProject.structuralPatterns.decorator;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;

public abstract class AdvisorDecorator extends FullTimeFaculty {
    FullTimeFaculty faculty;
    public abstract String getDescription();
}
