package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;


import java.util.ArrayList;

public class PartTimeFaculty extends Faculty{
    private final int MAX_SIZE = 1;
    public PartTimeFaculty() { super();}
    public PartTimeFaculty(String name) {
        super.name = name;
        super.coursesTeaching = new ArrayList<>(MAX_SIZE);
        super.maxNumCourses = MAX_SIZE;
    }
    @Override
    public String toString() {
        return super.toString() + " -> Part-time faculty : " + super.getName();
    }
}
