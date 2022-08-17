package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.graduate;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.GraduateProgram;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class MSCS extends GraduateProgram {
    public MSCS(String programName,
                 ArrayList<Course> coreCoursesList,
                 ArrayList<Course> electiveCoursesList) {
        super(programName, coreCoursesList, electiveCoursesList);
    }
    @Override
    public String toString() {
        return super.toString() + " -> MSCS";
    }
}
