package cs665.tbconde.finalProject.creationalPatterns.builder;

public class CS665HTMLBuilder implements HTMLBuilder{
    private HTMLProduct htmlProduct;
    public CS665HTMLBuilder() {
        htmlProduct = new HTMLProduct();
    }
    @Override
    public void createHeader() {
        this.htmlProduct.add("Step 1: Creating CS665 Header...");
    }
    @Override
    public void createSidebar() {
        this.htmlProduct.add("Step 2: Creating CS665 Sidebar...");
    }
    @Override
    public void createMainPanel() {
        this.htmlProduct.add("Step 3: Creating CS665 Main Panel...");
    }

    @Override
    public void createFooter() {
        this.htmlProduct.add("Step 4: Creating CS665 Footer...");
    }

    @Override
    public HTMLProduct getHTML() {
        return htmlProduct;
    }
}
