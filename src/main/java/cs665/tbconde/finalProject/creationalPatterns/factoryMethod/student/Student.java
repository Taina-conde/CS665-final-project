package cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student;

import cs665.tbconde.finalProject.behavioralPatterns.state.ElectivesEligible;
import cs665.tbconde.finalProject.behavioralPatterns.state.ElectivesIneligible;
import cs665.tbconde.finalProject.behavioralPatterns.state.PossibleState;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Faculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public abstract class Student {
    Program programEnrolled;
    String name;
    ArrayList<Course> coursesTaken;
    double gpa;
    ArrayList<String> grades;
    int semestersCompleted;
    PossibleState currentState;
    public Student(String name) {
        this.name = name;
        this.coursesTaken = new ArrayList<>();
        this.gpa = 0;
        this.grades = new ArrayList<>();
        this.semestersCompleted = 0;
        this.currentState = new ElectivesIneligible();
    }
    public double calculateGPA(){
        int CREDITS = 4;
        int VALUE_A = 4;
        int VALUE_B = 3;
        int VALUE_C = 2;
        int VALUE_D = 1;
        int VALUE_F = 0;
        int TOTAL_CREDITS = CREDITS * this.grades.size();
        int totalPoints = 0;
        for (String grade: grades){
            int qualityPoints = 0;
            switch(grade) {
                case "A" :
                    qualityPoints += VALUE_A * CREDITS;
                    break;
                case "B":
                    qualityPoints += VALUE_B * CREDITS;
                    break;
                case "C" :
                    qualityPoints += VALUE_C * CREDITS;
                    break;
                case "D":
                    qualityPoints += VALUE_D * CREDITS;
                    break;
                default:
                    qualityPoints += VALUE_F * CREDITS;

            }
            totalPoints += qualityPoints;
        }
        this.gpa = totalPoints / TOTAL_CREDITS;
        return this.gpa;
    };
    public void sendQuery(String query, ArrayList<Faculty> toWhom) {
        System.out.println("**Student " + this.name + "**");
        for (Faculty f: toWhom) {
            System.out.println("\s\ssend: " + query + "\nto: " + f.getName());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", coursesTaken=" + coursesTaken +
                ", gpa=" + gpa +
                ", grades=" + grades +
                ", semestersCompleted=" + semestersCompleted;
    }

    public Program getProgramEnrolled() {
        return programEnrolled;
    }

    public void addSemesterCompleted() {
        int SEMESTERS_IN_YEAR = 2;
        int programLastYear = programEnrolled.getDURATION_SEMESTERS() - SEMESTERS_IN_YEAR;
        this.semestersCompleted ++;
        boolean studentLastYear = this.semestersCompleted >= programLastYear;
        if (studentLastYear) {
            currentState = new ElectivesEligible();
            System.out.println("student is in the last year of the program.");
        }
    }


    public PossibleState getCurrentState() { return currentState;}
    public void setCurrentState(PossibleState state) { this.currentState = state;}
    public void enrollInElective(Course course) {
        currentState.enrollElective(this, course);
    }
    public void enrollInCore(Course course) {
        course.enrollStudent(this);
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
    public void addCourseTaken(Course course) {
        coursesTaken.add(course);
    }
    public void dropCourse(Course course) {
        coursesTaken.remove(course);

    }
}
