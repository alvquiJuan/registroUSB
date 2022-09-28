public abstract class Estudiante{

    protected String givenName;
    protected String familyName;
    protected int code;
    protected String program;

    public Estudiante(){
        //nothing to do...
    }

    public Estudiante(String givenName, String familyName, int code, String program) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.code = code;
        this.program = program;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    



}