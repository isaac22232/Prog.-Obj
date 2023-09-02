// Verificar de 3 numeros cual es mayor

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa los numeros a verificar");
        System.out.print("Primer numero  : "); num1 = obj.nextInt();
        System.out.print("Segundo numero : "); num2 = obj.nextInt();
        System.out.print("Tercer numero  : "); num3 = obj.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", num1, num2, num3));
            }
        }else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", num2, num1, num3));
            }else if (num3 > num1) {
                if (num3 > num2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", num3, num2, num1));
                }
            }
        }else if (num3 > num1) {
            if (num3 > num2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d y %d", num3, num2, num1));
            }
        }

        obj.close();
    }
}