// Manda un saludo a ala pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Diego";
        String hermana ="Valentina";
        String mensaje = String.format("Tanto %s como %s desean aprender a programar en java",hermana, amigo);

        System.out.println("Hola Mundo desde el lenguaje java");
        System.out.println("\nHola amigo " + amigo + " mi hermana es " + hermana);
        System.out.println("\nMi amigo es " + amigo + " mi hermana es " + hermana);
        System.out.println("\n" + mensaje);
    }
}