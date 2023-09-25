import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor inicial del rango: ");
        int ini = scanner.nextInt();
        
        System.out.println("Ingrese el valor final del rango: ");
        int fin = scanner.nextInt();
        
        if (ini < fin) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Suma de múltiplos de 3");
            System.out.println("2. Suma de múltiplos de 4");
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                int suma = SumaMultiplos(ini, fin, 3);
                System.out.println("La suma de múltiplos de 3 en el rango es: " + suma);
            } else if (opcion == 2) {
                int suma = SumaMultiplos(ini, fin, 4);
                System.out.println("La suma de múltiplos de 4 en el rango es: " + suma);
            } else {
                System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("El rango no es válido. El valor inicial debe ser menor que el valor final.");
        }
        
        scanner.close();
    }
}
