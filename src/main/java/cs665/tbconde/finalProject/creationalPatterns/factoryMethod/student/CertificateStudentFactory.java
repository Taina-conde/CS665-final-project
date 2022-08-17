package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.program.Program;

public class CertificateStudentFactory extends StudentFactory{
    public CertificateStudentFactory(String name, Program programEnrolled, String concentration) {
        super.name = name;
        super.programEnrolled = programEnrolled;
        super.concentration = concentration;
    }

    @Override
    public Student createStudent() {
        return new CertificateStudent(super.name, super.programEnrolled, super.concentration);
    }
}
