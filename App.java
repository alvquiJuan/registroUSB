public class App {

    public static void main(String[] args) {
        Pregrado [] est_pregrado = new Pregrado[3];
        Especializacion[] est_especializacion= new Especializacion[2];

        Pregrado p1= new Pregrado("Arturo", "Jimenez", 60257, "Ing. biomedica", 22, 4.8);
        est_pregrado[0]=p1;
        p1 = new Pregrado("Maria Camila", "Restrepo", 82046, "Ing. de Sist.", 43, 3.97);
        est_pregrado[1]=p1;
        p1 = new Pregrado("Alexander", "Pelaez", 31205, "Lic. en literatura", 54, 4.98);
        est_pregrado[2]=p1;

        Especializacion e1 = new Especializacion("Gabriela", "Castro", 98724, "Esp. procesos de software", "20-11-2019", "Lic inform'atica");
        est_especializacion[0]= e1;
        e1 = new Especializacion("Daniel", "Diaz", 65015, "Esp. en humanidades", "30-03-2017", "Sociologia") ;
        est_especializacion[1]= e1;

        for (int i = 0; i< est_pregrado.length; i++){
            System.out.println(est_pregrado[i]);
        }

        for (int i = 0; i < est_especializacion.length; i++) {
            System.out.println(est_especializacion[i]);
        }
        est_pregrado[1].graduar("4.7");
    }
    
    
}
