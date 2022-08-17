package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;


import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;

public abstract class StudentFactory {
    String name;
    Program programEnrolled;
    String concentration = null;
    public abstract Student createStudent();
}
