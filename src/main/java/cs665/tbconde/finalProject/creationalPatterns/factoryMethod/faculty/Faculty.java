package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

import java.util.ArrayList;

public abstract class Faculty {
    String name;
    ArrayList<Course> coursesTeaching;
    ArrayList<Student> studentsAdvising;

    public String getName() {
        return name;
    }

    public String toString() {
            return "**Faculty**";
        }

}
