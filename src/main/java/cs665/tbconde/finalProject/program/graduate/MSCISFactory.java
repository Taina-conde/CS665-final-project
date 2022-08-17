package cs665.tbconde.finalProject.program.graduate;

import cs665.tbconde.finalProject.program.GraduateProgram;
import cs665.tbconde.finalProject.program.ProgramType;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

import java.util.ArrayList;

public class MSCISFactory extends GraduateProgramFactory {
    public MSCISFactory(ProgramType type, ArrayList<Course> coreCoursesList, ArrayList<Course> electiveCoursesList) {
        super.programName = type.name();
        super.coreCoursesList = coreCoursesList;
        super.electiveCoursesList = electiveCoursesList;
    }
    @Override
    public GraduateProgram createGraduateProgram() {
        return new MSCIS(programName, coreCoursesList, electiveCoursesList);
    }
}
