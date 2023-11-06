package _p114_Animal;

public class Perro implements Animal {

    @Override
    public void Dormir() {
        System.out.println("El perro duerme en su casa");
        System.out.println("Envidio al perro :(");
        
    }

    @Override
    public void Sonido() {
        System.out.println("El perro hace gua gua");
        
    }

    @Override
    public void Comer() {
        System.out.println("El perro come croquetas y si no ajusta se come al perro");
        
    }
    
    
}
