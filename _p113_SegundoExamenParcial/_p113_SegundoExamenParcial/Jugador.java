package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected Character Sexo;
    protected String Descripcion;
    protected double Salario;
    protected double Total;
    
    public Jugador(String nombre, Character sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Character getSexo() {
        return Sexo;
    }

    public void setSexo(Character sexo) {
        Sexo = sexo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario
                + "]";
    }

    public abstract double getTotal();

    

}
