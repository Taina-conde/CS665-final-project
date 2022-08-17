package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.structuralPatterns.composite.concentration.Course;

public class PartTimeFaculty extends Faculty{
    Course courseTeaching;
    public PartTimeFaculty(String name) {
        super.name = name;
    }
    public PartTimeFaculty(String name, Course courseTeaching) {
        super.name = name;
        this.courseTeaching = courseTeaching;
    }

    public void setCourseTeaching(Course courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    public Course getCourseTeaching() {
        return courseTeaching;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Part-time faculty : " + super.getName();
    }
}
