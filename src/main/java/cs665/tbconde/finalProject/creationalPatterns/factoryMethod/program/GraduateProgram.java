package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program;

import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class GraduateProgram extends Program {
    public GraduateProgram(
            String programName,
            ArrayList<Course> coreCoursesList,
            ArrayList<Course> electiveCoursesList
    ) {
        super.coreCoursesList = coreCoursesList;
        super.electiveCoursesList = electiveCoursesList;
        super.programName = programName;
        super.DURATION_SEMESTERS = 4;
    }

    @Override
    public String toString() {
        return super.toString() + " -> GraduateProgram";
    }
}
