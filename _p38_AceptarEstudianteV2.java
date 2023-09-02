import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        String nombre;
        char sexo;
        int edad;
        double calificacion1, calificacion2, calificacion3, promedio;

        System.out.println("Solicitud de Admisión - Universidad Kitty Kat SA\n");
        System.out.print("Ingrese el nombre del estudiante: "); nombre = scanner.nextLine();
        System.out.print("Ingrese el sexo del estudiante (h/m): "); sexo = scanner.nextLine().charAt(0);
        System.out.print("Ingrese la edad del estudiante: "); edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la primera calificación: "); calificacion1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la segunda calificación: "); calificacion2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la tercera calificación: "); calificacion3 = Double.parseDouble(scanner.nextLine());
        
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("\nProcesando...");

        if (sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.println("\n¡Felicidades, " + nombre + "! Has sido aceptada en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("\nLo siento, " + nombre + ". No cumples con los requisitos de aceptación.");
        }

        scanner.close();
    }
}