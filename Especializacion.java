public class Especializacion extends Posgrado{

    
    protected String pregrado_base;

    

    public Especializacion(String givenName, String familyName, int code, String program, String fecha_grado,
            String pregrado_base) {
        super(givenName, familyName, code, program, fecha_grado);
        this.pregrado_base = pregrado_base;
    }

    public String getPregrado_base() {
        return pregrado_base;
    }

    public void setPregrado_base(String pregrado_base) {
        this.pregrado_base = pregrado_base;
    }


    
}
