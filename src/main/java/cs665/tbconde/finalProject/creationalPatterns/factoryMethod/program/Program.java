package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program;

import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public abstract class Program {
    String programName;
    ArrayList<Course> coreCoursesList;
    ArrayList<Course> electiveCoursesList;
    int DURATION_SEMESTERS;

    public int getDURATION_SEMESTERS() {
        return DURATION_SEMESTERS;
    }

    public void setDURATION_SEMESTERS(int DURATION_SEMESTERS) {
        this.DURATION_SEMESTERS = DURATION_SEMESTERS;
    }

    public String toString() {
        return "**Program**";
    }

    public ArrayList<Course> getCoreCoursesList() {
        return coreCoursesList;
    }

    public ArrayList<Course> getElectiveCoursesList() {
        return electiveCoursesList;
    }
}
