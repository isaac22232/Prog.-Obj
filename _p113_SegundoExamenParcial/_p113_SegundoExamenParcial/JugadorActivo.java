package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Goles;
    private int Partido;
    
    public JugadorActivo(String nombre, Character sexo, String descripcion, double salario, int goles, int partido) {
        super(nombre, sexo, descripcion, salario);
        Goles = goles;
        Partido = partido;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int goles) {
        Goles = goles;
    }

    public int getPartido() {
        return Partido;
    }

    public void setPartido(int partido) {
        Partido = partido;
    }
    
    public double getTotal(){
        Total = getSalario() + getBono(); 
        return Total;
    }

    @Override
    public double getBono() {
        double bono = (getSalario() * 0.10) + (Partido * 50) + (Goles * 5);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorActivo [Goles=" + Goles + ", Partido=" + Partido + "Total=" + getTotal() + "Bono="+ getBono() + "]";
    }

    
}
