// Convertir de centigrados a farenheit y viceversa

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
            float temp, res;
            Scanner obj = new Scanner(System.in);

            System.out.println("Convierte de centigrados a farenheit y viceversa");
            System.out.print("[F] arenheit a Centigrados");
            System.out.print("[C] entigrados a farenheit");
            System.out.println("Elije una opcion: ");
            op = Character.toUpperCase(obj.next().charAt(0) );

            if( op=='F' ) {
                System.out.println("\nConvertir de Farenheit a Centigrados\n");
                System.out.print("Dame los grados Farenheit ? "); temp = obj.nextFloat();
                res = ( temp - 32 ) * 5 / 9;
                System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, res);
            }
            else {
                System.out.println("\nConvertir de Centigrados a Farenheit\n");
                System.out.print("Dame los grados Centigrados ? "); temp = obj.nextFloat();
                res = ( temp * 9 / 5 ) + 32;
                System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, res);;
            }

            System.out.println("\nGracias por utilizar este programa");
            obj.close();
    }
}
