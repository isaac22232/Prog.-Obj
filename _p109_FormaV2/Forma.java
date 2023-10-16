package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean Relleno;
    
    
    public Forma(String color, boolean relleto) {
        Color = color;
        Relleno = relleto;
    }

   
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isRelleto() {
        return Relleno;
    }

    public void setRelleto(boolean relleto) {
        Relleno = relleto;
    }

    
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleto=" + Relleno + "]";
    }
    
}
