package cs665.tbconde.finalProject;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Chairperson;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.Faculty;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.FacultyType;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.ProgramType;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.Student;
import cs665.tbconde.finalProject.creationalPatterns.singleton.CSDepartment;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        //singleton CSDepartment
        CSDepartment department = CSDepartment.getInstance();
        // create one faculty
        Faculty kalanthur = department.createFaculty("11-111", "Suresh Kalanthur", FacultyType.FullTime);

        //create 2 courses
        String courseId = "CS665";
        int maxStudents = 2;
        String courseTitle = "Software Design and Patterns";
        String courseDescription = "...";
        String courseSyllabus = "Module 1- .... Module 2 - .... Module 3 - ....";
        Course designPatterns = department.createCourse(
                courseId,
                courseTitle ,
                kalanthur,
                courseDescription,
                courseSyllabus,
                maxStudents
        );
        courseTitle = "Software Engineering";
        courseId = "CS673";
        Course softEng = department.createCourse(courseId, courseTitle, kalanthur, courseDescription,courseSyllabus,
                maxStudents);
        // create mscs program
        String programName = "Master of Science in Computer Science";
        ArrayList<Course> coreCoursesList = new ArrayList<>();
        ArrayList<Course> electiveCoursesList = new ArrayList<>();
        coreCoursesList.add(designPatterns); // design patterns is a core course
        electiveCoursesList.add(softEng); // softEng is an elective course
        Program mscs = department.createGraduateProgram(
                programName,
                ProgramType.MSCS,
                coreCoursesList,
                electiveCoursesList
        );
        // create 4 students
        String studentId = "BU1234";
        String name = "Taina Conde";
        Student taina = department.createStudent(studentId, name, ProgramType.MSCS  );
        studentId = "BU7890";
        name = "Alice Pacheco";
        Student alice = department.createStudent(studentId, name, ProgramType.MSCS);
        studentId = "BU 102938";
        name = "Bob Marley";
        Student bob = department.createStudent(studentId, name, ProgramType.MSCS);
        studentId = "BU 19999";
        name = "Charlie Bolt";
        Student charlie = department.createStudent(studentId, name, ProgramType.MSCS);

        // students enrolling and dropping classes
        department.enrollStudentInCourse(designPatterns, taina);
        department.enrollStudentInCourse(designPatterns, alice);
        department.enrollStudentInCourse(designPatterns, bob);
        department.enrollStudentInCourse(designPatterns, charlie);
        department.dropStudentInCourse(designPatterns, taina);
        department.dropStudentInCourse(designPatterns, alice);

    }
}
