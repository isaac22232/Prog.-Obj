// Verificar si 3 numeros dados son consecutivos

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa los numeros a verificar");
        System.out.print("Numero 1: "); num1 = obj.nextInt();
        System.out.print("Numero 2: "); num2 = obj.nextInt();
        System.out.print("Numero 3: "); num3 = obj.nextInt();

        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.println(String.format("Los numeros (%d, %d, %d) son consecutivos", num1, num2, num3));
        } else if (num2 == num1 - 1 && num3 == num2 - 1) {
            System.out.println(String.format("Los numeros (%d, %d, %d) son consecutivos", num1, num2, num3));
        } else {
            System.out.println(String.format("Los numeros (%d, %d, %d) no son consecutivos", num1, num2, num3));
        }

        obj.close();
    }
}