package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class FullTimeFaculty extends Faculty {
    private final int MAX_SIZE = 3;

    public FullTimeFaculty() {
        super();
    }
    public FullTimeFaculty(String name) {
        super.name = name;
        super.coursesTeaching = new ArrayList<Course>(MAX_SIZE);
        super.maxNumCourses = MAX_SIZE;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Full-time faculty: " + super.getName() ;
    }
}
