package _p114_Animal;
// Una Clase implementa una interfaz al hacerlo debe sobrecarga todos sus metodos
public class Gato implements Animal {

    @Override
    public void Dormir() {
        System.out.println("El gato duerme en la caja");
        
    }

    @Override
    public void Sonido() {
        System.out.println("El gato hace miau");
        
    }

    @Override
    public void Comer() {
        System.out.println("El gato come wiskas y aveces le toca sobre");
        
    }
    
}
