package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

import java.util.ArrayList;

public class FullTimeFaculty extends Faculty {
    private final int MAX_SIZE = 3;
    ArrayList<Course> coursesTeaching;
    public FullTimeFaculty() {
        super();
    }
    public FullTimeFaculty(String name) {
        super.name = name;
        coursesTeaching = new ArrayList<Course>(3);
    }
    public void addCourse(Course course) {
        if (coursesTeaching.size() == 3) {
            System.out.println("Limit of courses reached. The maximum is " + MAX_SIZE + " courses");
        } else {
            coursesTeaching.add(course);
        }
    }
    @Override
    public String toString() {
        return super.toString() + " -> Full-time faculty: " + super.getName() ;
    }
}
