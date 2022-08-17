package cs665.tbconde.finalProject.creationalPatterns.builder;

public interface HTMLBuilder {
    void createHeader();
    void createSidebar();
    void createMainPanel();
    void createFooter();
    HTMLProduct getHTML();
}
