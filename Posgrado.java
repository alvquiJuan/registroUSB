public abstract class Posgrado extends Estudiante {
    protected String fecha_grado;



    public Posgrado(String givenName, String familyName, int code, String program, String fecha_grado) {
        super(givenName, familyName, code, program);
        this.fecha_grado = fecha_grado;
    }

    public String getFecha_grado() {
        return fecha_grado;
    }

    public void setFecha_grado(String fecha_grado) {
        this.fecha_grado = fecha_grado;
    }
    
}
