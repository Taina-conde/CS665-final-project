package cs665.tbconde.finalProject.structuralPatterns.composite.concentration;

public abstract class CourseComposite {
    public void add(CourseComposite composite) {
        throw new UnsupportedOperationException();
    }
    public void remove(CourseComposite composite) {
        throw new UnsupportedOperationException();
    }
    public abstract HTMLOutput format();
}
