package cs665.tbconde.finalProject.creationalPatterns.singleton;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Faculty;
import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

public class Chairperson extends Faculty {
    Course courseTeaching;

    private static Chairperson uniqueInstance;
    private Chairperson() {

    }
    public static synchronized Chairperson getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Chairperson();
        }
        return uniqueInstance;
    }

    public synchronized Course getCourseTeaching() {
        return courseTeaching;
    }

    public synchronized void setCourseTeaching(Course courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}
