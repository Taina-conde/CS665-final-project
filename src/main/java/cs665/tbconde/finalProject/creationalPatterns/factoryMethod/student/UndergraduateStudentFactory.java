package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;

public class UndergraduateStudentFactory extends StudentFactory {
    public UndergraduateStudentFactory(String name, Program programEnrolled) {
        super.name = name;
        super.programEnrolled = programEnrolled;
    }
    @Override
    public Student createStudent() {
        return new UndergraduateStudent(super.name, super.programEnrolled );
    }
}
