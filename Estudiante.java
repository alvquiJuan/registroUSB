public class Pregrado extends Estudiante{

  
    protected int credits;
    protected double average;

    public Pregrado(){
        
    }

    public Pregrado(String givenName, String familyName, int code, String program, int credits, double d) {
        super(givenName, familyName, code, program);
        setCredits(credits);
        setAverage(d);
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return  super.toString()+ ", average=" + average + ", credits=" + credits + "]";
    }

    public void graduar() {
        System.out.println("felicidades crack, eres profesional");
    }

    public void graduar(String theProgram) {
        System.out.println("haz logrado obtener el titulo de " + theProgram);
        
    }

   

    public void graduar(double prom) {
        if (prom>4.5){
            System.out.println("fuiste un crack en tu programa");

        }
        else if (4.0< prom && prom<= 4.5) {
            System.out.println("no te fue mal en la U");
        } else {
            System.out.println("pana, lo importante es que hay salud");
        }
        
    }


    
}
