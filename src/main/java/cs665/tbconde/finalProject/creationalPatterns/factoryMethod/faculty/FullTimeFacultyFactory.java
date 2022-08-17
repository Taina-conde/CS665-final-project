package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty;

public class FullTimeFacultyFactory extends FacultyFactory {
    public FullTimeFacultyFactory(String name) {
        super.name = name;
    }
    @Override
    public Faculty createFaculty() {
        return new FullTimeFaculty(super.name);
    }
}
