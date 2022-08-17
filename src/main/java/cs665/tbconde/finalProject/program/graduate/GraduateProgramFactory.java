package cs665.tbconde.finalProject.program.graduate;

import cs665.tbconde.finalProject.program.GraduateProgram;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

import java.util.ArrayList;

public abstract class GraduateProgramFactory {
    String programName;
    ArrayList<Course> coreCoursesList;
    ArrayList<Course> electiveCoursesList;
    public abstract GraduateProgram createGraduateProgram();
}
