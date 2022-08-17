package cs665.tbconde.finalProject.structuralPatterns.composite;

public abstract class CourseComposite {
    String title;
    String description;
    public void add(CourseComposite composite) {
        throw new UnsupportedOperationException();
    }
    public void remove(CourseComposite composite) {
        throw new UnsupportedOperationException();
    }
    public abstract HTMLOutput format();
}
