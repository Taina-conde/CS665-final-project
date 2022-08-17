package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.behavioralPatterns.state.ElectivesIneligible;
import cs665.tbconde.finalProject.program.Program;
import cs665.tbconde.finalProject.program.ProgramType;
import cs665.tbconde.finalProject.program.GraduateProgram;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, Program programEnrolled) {
        super(name);
        super.programEnrolled = programEnrolled;
    }

    @Override
    public String toString() {
        return super.toString() + ", programEnrolled=" + programEnrolled;
    }

    public Program getProgramEnrolled() {
        return programEnrolled;
    }
}
