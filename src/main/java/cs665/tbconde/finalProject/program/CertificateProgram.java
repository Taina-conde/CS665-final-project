package cs665.tbconde.finalProject.program;

public class CertificateProgram extends Program {

    String concentration;


    public CertificateProgram(ProgramType programType, String concentration) {
        super.programName = programType.name();
        super.DURATION_SEMESTERS = -1;
        this.concentration = concentration;

    }
}