package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, Program programEnrolled) {
        super(name);
        super.programEnrolled = programEnrolled;
    }

    @Override
    public String toString() {
        return super.toString() + ", programEnrolled=" + programEnrolled;
    }
}
