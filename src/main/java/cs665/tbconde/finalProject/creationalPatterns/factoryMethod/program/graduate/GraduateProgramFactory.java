package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.graduate;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.GraduateProgram;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public abstract class GraduateProgramFactory {
    String programName;
    ArrayList<Course> coreCoursesList;
    ArrayList<Course> electiveCoursesList;
    public abstract GraduateProgram createGraduateProgram();
}
