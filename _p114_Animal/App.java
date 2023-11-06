package _p114_Animal;

public class App {
    public static void main(String[] args) {
        //Animal miAnimal = new Animal() { -- no se puede instanciar una interfaz
        Gato miGato = new Gato();

        miGato.Dormir();
        miGato.Sonido();
        miGato.Comer();

        Perro miPerro = new Perro();

        miPerro.Dormir();
        miPerro.Sonido();
        miPerro.Comer();
    }
}
