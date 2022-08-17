package cs665.tbconde.finalProject.structuralPatterns.composite;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FullTimeFaculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.PartTimeFaculty;

import java.util.ArrayList;

public class Concentration extends CourseComposite {
    ArrayList<CourseComposite> components = new ArrayList<CourseComposite>();
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
    
}
