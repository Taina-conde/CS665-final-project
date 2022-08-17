package cs665.tbconde.finalProject.program.graduate;

import cs665.tbconde.finalProject.program.GraduateProgram;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

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
