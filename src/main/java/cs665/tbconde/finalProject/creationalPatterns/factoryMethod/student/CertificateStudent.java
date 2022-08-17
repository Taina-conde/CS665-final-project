package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;

public class CertificateStudent extends Student {
    public CertificateStudent(String name, Program programEnrolled, String concentration) {
        super(name);
        super.programEnrolled = programEnrolled;
    }

    @Override
    public String toString() {
        return super.toString() + ", programEnrolled=" + programEnrolled;
    }
}
