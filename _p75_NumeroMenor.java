//Programa que pide cuatro numeros y analiza cual es el menor usando una funsion

import java.util.Scanner;

public class _p75_NumeroMenor {
    public static int encontrarMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }

        return menor;
    }
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, menor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.println("Imgresa los numeros.");
        System.out.print("\nPrimer número entero:  ");numero1 = scanner.nextInt();
        System.out.print("Segundo número entero: ");numero2 = scanner.nextInt();
        System.out.print("Tercer número entero:  ");numero3 = scanner.nextInt();
        System.out.print("Cuarto número entero:  ");numero4 = scanner.nextInt();
       
        menor = encontrarMenor(numero1, numero2, numero3, numero4);
        
        System.out.println("\nEl número menor es: " + menor);
        
        scanner.close();
    }
    
}
