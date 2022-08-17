package cs665.tbconde.finalProject.structuralPatterns.composite;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.PartTimeFaculty;

import java.util.ArrayList;

public class Concentration extends CourseComposite {
    ArrayList<CourseComposite> components = new ArrayList<CourseComposite>();
    String title;
    String description;
    public Concentration(String title, String description) {
        this.title = title;
        this.description = description;
    }
    @Override
    public void add(CourseComposite component) {
        components.add(component);
    }

    @Override
    public void remove(CourseComposite component) {
        components.remove(component);
    }

    @Override
    public HTMLOutput format() {
        System.out.println("** Concentration: " + this.title + " / description: " + this.description );
        for (CourseComposite c : components) {
            System.out.print("\s\s");
            c.format();
        }
        return null;
    }
    public static void main(String[] args) {
        CourseComposite course1 = new Course(
                "Design patterns",
                new FullTimeFaculty("kalanthur"),
                "This course is about design patterns",
                "Module 1 - creational patterns, Module 2 - structural patterns, Module 3 - behavioral patterns");
        course1.format();
        CourseComposite course2 = new Course(
                "Software Engineering",
                new FullTimeFaculty("Yuting"),
                "This course is about ...",
                "Module 1 - ..., Module 2 - ..., Module 3 - ...");
        CourseComposite course3 = new Course(
                "Python",
                new PartTimeFaculty("bbb"),
                "This course is about python",
                "Module 1 - types, Module 2 - arrays, Module 3 - dictionary");
        CourseComposite concentration1 = new Concentration("Software Engineering", "This concentration ...");
        concentration1.add(course1);
        concentration1.add(course2);
        concentration1.format();
        CourseComposite concentration2 = new Concentration("Procedural languages", "This subconcentration ...");
        concentration2.add(course3);
        concentration2.format();
        CourseComposite concentration3 = new Concentration("Programming languages", "this concentration ...");
        concentration3.add(concentration2);
        concentration3.format();
    }
}
