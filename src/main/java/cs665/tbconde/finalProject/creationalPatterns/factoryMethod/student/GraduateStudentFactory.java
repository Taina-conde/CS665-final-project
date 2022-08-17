package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.program.Program;

public class GraduateStudentFactory extends StudentFactory {
    public GraduateStudentFactory(String name, Program programEnrolled) {
        super.name = name;
        super.programEnrolled = programEnrolled;
    }

    @Override
    public Student createStudent() {
        return new GraduateStudent(super.name, super.programEnrolled);
    }
}
