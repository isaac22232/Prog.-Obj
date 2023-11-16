package _p145_EstudianteGUI_V1;
import java.io.Serializable;

public class Estudiante implements Serializable {
    String Nombre;
    int Edad;
    double peso;
    String correo;

    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, int edad, double peso, String correo) {
        Nombre = nombre;
        Edad = edad;
        this.peso = peso;
        this.correo = correo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
