package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

public class PartTimeFacultyFactory extends FacultyFactory{
    public PartTimeFacultyFactory(String name) {
        super.name = name;
    }
    @Override
    public Faculty createFaculty() {
        return new PartTimeFaculty(super.name);
    }
}
