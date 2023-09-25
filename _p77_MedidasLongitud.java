//convertir Pulgadas a Centimetros y Metros a Pies

import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static float convertirPulgadas(float n, float r){
        Scanner obj = new Scanner(System.in);
        System.out.println("\nConvertir de Pulgadas a Centimetros\n");
        System.out.print("Dame las Pulgadas ? "); n = obj.nextFloat();
        r = (float) (n * 2.54);
        System.out.printf("%.2f Pulgadas, equivalen a %.2f Centimetros", n, r);
        obj.close();
        return r;
    }
    
    public static float convertirMetros(float n, float r){
        Scanner obj = new Scanner(System.in);
        System.out.println("\nConvertir de Metros a Pies\n");
            System.out.print("Dame los Metros ? "); n = obj.nextFloat();
            r = (float) (n * 3.281);
            System.out.printf("%.2f Metros, equivalen a %.2f Pies", n, r);
        obj.close();
        return r;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        float n, r;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nConvierte de Pulgadas a Centimetros y Metros a Pies\n");
        System.out.print("[C] entimetros a Pulgadas");
        System.out.print("\n[M] etros a pies\n");
        System.out.println("\nElije una opcion: ");
        op = Character.toUpperCase(obj.next().charAt(0) );

        r = 0;
        n = 0;

        if( op=='C' ) {
            convertirPulgadas(n, r);
        }
        else {
            convertirMetros(n, r);
        }
            
        System.out.println("\nGracias por utilizar este programa");
        obj.close();
    }
}
