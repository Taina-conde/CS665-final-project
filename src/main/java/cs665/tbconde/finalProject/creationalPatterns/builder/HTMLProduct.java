package cs665.tbconde.finalProject.creationalPatterns.builder;

import java.util.LinkedList;

public class HTMLProduct {
    private LinkedList<String> steps;
    public HTMLProduct() {steps = new LinkedList<String>();}
    public void add(String step) {
        steps.addLast(step);
    }
    public void showHTMLProduct() {
        System.out.println("HTML completed as below: ");
        for (String step: steps) {
            System.out.println(step);
        }
    }
}
