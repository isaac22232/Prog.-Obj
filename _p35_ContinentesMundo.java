// Escribir el continente segun el numero dado entre el 1 y 6

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra un  continente en base al número: \n");
        System.out.print("Dame un numero (1..6) ? ");
        int n = new Scanner(System.in).nextInt();
        
        if(n==1) System.out.println("\nAsia");
        if(n==2) System.out.println("\nÁfrica");
        if(n==3) System.out.println("\nAmerica del Norte");
        if(n==4) System.out.println("\nAmerica del Sur");
        if(n==5) System.out.println("\nAntartida");
        if(n==6) System.out.println("\nEuropa");
        if (n > 6) System.out.println("\nError");
        System.out.println("\nProceso terminado ....");
    }
}
