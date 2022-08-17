package cs665.tbconde.finalProject.creationalPatterns.builder;

public class Director {
    HTMLBuilder builder;

    public void construct(HTMLBuilder builder)
    {
        this.builder = builder;
        builder.createHeader();
        builder.createSidebar();
        builder.createMainPanel();
        builder.createFooter();
    }
}
