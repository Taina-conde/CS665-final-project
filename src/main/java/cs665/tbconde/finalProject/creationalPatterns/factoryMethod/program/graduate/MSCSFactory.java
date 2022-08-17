package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.graduate;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.GraduateProgram;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.ProgramType;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class MSCSFactory extends GraduateProgramFactory {
    public MSCSFactory(ProgramType type, ArrayList<Course> coreCoursesList, ArrayList<Course> electiveCoursesList) {
        super.programName = type.name();
        super.coreCoursesList = coreCoursesList;
        super.electiveCoursesList = electiveCoursesList;
    }
    @Override
    public GraduateProgram createGraduateProgram() {
        return new MSCS(programName, coreCoursesList, electiveCoursesList);
    }
}
