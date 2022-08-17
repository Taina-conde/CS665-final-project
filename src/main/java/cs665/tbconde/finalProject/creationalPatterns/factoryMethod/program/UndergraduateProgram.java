package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program;

import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class UndergraduateProgram extends Program {
    public UndergraduateProgram(ProgramType programType, ArrayList<Course> coreCoursesList,
                                ArrayList<Course> electiveCoursesList) {
        super.coreCoursesList = coreCoursesList;
        super.electiveCoursesList = electiveCoursesList;
        super.programName = programType.name();
        super.DURATION_SEMESTERS = 8;
    }
}
