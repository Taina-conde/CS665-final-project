package cs665.tbconde.finalProject.creationalPatterns.singleton;

import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.faculty.*;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.student.*;
import cs665.tbconde.finalProject.exceptions.CSDepartmentException;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.Program;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.ProgramType;
import cs665.tbconde.finalProject.creationalPatterns.factoryMethod.program.graduate.*;
import cs665.tbconde.finalProject.structuralPatterns.composite.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CSDepartment {
    private Map<String, Student> studentMap;
    private Map<String, Faculty> facultyMap;
    private Map<String, Course> courseMap;
    private Map<String, Program> programMap;
    private static CSDepartment uniqueInstance;


    private CSDepartment() {
        studentMap = new HashMap<>();
        facultyMap = new HashMap<>();
        courseMap = new HashMap<>();
        programMap = new HashMap<>();
    }
    public static synchronized CSDepartment getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CSDepartment();
        }
        return uniqueInstance;
    }

    private synchronized void findDuplicate(Map map, String id ) throws CSDepartmentException {
        boolean exists = false;
        String duplicatedError = "The id (" + id + ") already exists.";
        for (Object key : map.keySet()) {
            if (key.equals(id))
                exists = true;
        }
        if (exists)
            throw new CSDepartmentException(duplicatedError);

    }

    public synchronized Student createStudent(String studentID, String studentName, ProgramType programType) {
        return createStudent(studentID, studentName,programType, null);
    }

    public synchronized Student createStudent(
            String studentID,
            String studentName,
            ProgramType programType,
            String concentration
    )  {
        findDuplicate(studentMap, studentID);
        StudentFactory factory = null;
        Student student = null;

        switch(programType) {
            case BSCS:
            case BSCIS:
                factory = new UndergraduateStudentFactory(studentName, programMap.get(programType.name()));
                break;

            case MSCIS:
            case MSCS:
            case MSDA:
                factory = new GraduateStudentFactory(studentName, programMap.get(programType.name()));
                break;

            default:
                factory = new CertificateStudentFactory(studentName, programMap.get(programType.name()), concentration);
        }
        student = factory.createStudent();
        this.studentMap.put(studentID, student);
        return student;

    }

    public synchronized Faculty createFaculty(String facultyID, String facultyName, FacultyType type) {
        findDuplicate(facultyMap, facultyID);
        FacultyFactory factory = null;
        Faculty faculty = null;
        switch(type) {
            case PartTime:
                factory = new PartTimeFacultyFactory(facultyName);
                break;
            case FullTime:
                factory = new FullTimeFacultyFactory(facultyName);
                break;
            default:
                // exception
        }
        faculty = factory.createFaculty();
        this.facultyMap.put(facultyID, faculty);
        return faculty;

    }
    public synchronized Course createCourse(
            String courseID,
            String title,
            Faculty instructor,
            String description,
            String syllabus,
            int maxStudents
    ) {
        findDuplicate(courseMap, courseID);
        Course course = new Course(title, instructor,description, syllabus, maxStudents);
        this.courseMap.put(courseID, course);
        instructor.addCourse(course);
        return course;
    }
    public synchronized Program createGraduateProgram(
            String programName,
            ProgramType type,
            ArrayList<Course> coreCoursesList,
            ArrayList<Course> electiveCoursesList
    ) {
        findDuplicate(courseMap, programName);
        GraduateProgramFactory factory = null;
        Program program = null;
        switch(type) {
            case MSCIS :
                factory = new MSCISFactory(type,coreCoursesList, electiveCoursesList);
                break;
            case MSCS:
                factory = new MSCSFactory(type, coreCoursesList, electiveCoursesList);
                break;
            case MSDA:
                factory = new MSDAFactory(type, coreCoursesList, electiveCoursesList);
                break;
            default:
                //exception

        }
        program = factory.createGraduateProgram();
        this.programMap.put(type.name(), program);
        return program;
    }

    public synchronized void enrollStudentInCourse(Course course, Student student) {
        boolean isElective = student.getProgramEnrolled().getElectiveCoursesList().contains(course);
        if (isElective)
            student.enrollInElective(course);
        else
            student.enrollInCore(course);
    }
    public synchronized void dropStudentInCourse(Course course, Student student) {
        String header = "Dropping student " + student.getName() +  " in " + course.getTitle();
        System.out.println(header);
        student.dropCourse(course);
        course.dropStudent(student);
    }



}
