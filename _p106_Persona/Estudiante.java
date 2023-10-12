package _p106_Persona;

public class Estudiante extends Persona {
    private String Carrera;
    private int AÑO;
    private double colegiatura;
    public Estudiante() {}

    public Estudiante(String nombre, String direccion, String carrera, int aÑO, double colegiatura) {
        super(nombre, direccion );
        Carrera = carrera;
        AÑO = aÑO;
        this.colegiatura = colegiatura;
    }

    public Estudiante(Persona persona, String carrera, int aÑO, double colegiatura) {
        super(persona.Nombre, persona.Direccion);
        Carrera = carrera;
        AÑO = aÑO;
        this.colegiatura = colegiatura;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getAÑO() {
        return AÑO;
    }

    public void setAÑO(int aÑO) {
        AÑO = aÑO;
    }

    public double getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        this.colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante ["+ super.toString()+", Carrera=" + Carrera + ", AÑO=" + AÑO + ", colegiatura=" + colegiatura + "]";
    }
    
    
}
