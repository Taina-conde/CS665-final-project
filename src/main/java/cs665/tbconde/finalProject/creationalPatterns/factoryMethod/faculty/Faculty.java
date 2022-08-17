package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public abstract class Faculty {
    String name;
    ArrayList<Course> coursesTeaching;
    ArrayList<Student> studentsAdvising;
    int maxNumCourses ;


    public String getName() {
        return name;
    }
    public void addCourse(Course course) {
        if (this.coursesTeaching.size() == maxNumCourses) {
            System.out.println("Limit of courses reached. The maximum is " + maxNumCourses + " courses");
        } else {
            this.coursesTeaching.add(course);
        }
    }

    public String toString() {
            return "**Faculty**";
        }

}
