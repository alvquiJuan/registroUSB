public class Pregrado extends Estudiante{

  
    protected int credits;
    protected float average;

    public Pregrado(){
        
    }

    public Pregrado(String givenName, String familyName, int code, String program, int credits, float average) {
        super(givenName, familyName, code, program);
        setCredits(credits);
        setAverage(average);
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }


    
}
