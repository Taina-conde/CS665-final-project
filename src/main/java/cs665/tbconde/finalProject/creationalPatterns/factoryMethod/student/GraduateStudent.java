package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;

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
