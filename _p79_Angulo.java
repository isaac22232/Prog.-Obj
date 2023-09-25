//Parametro de angulo con una funsion

import java.util.Scanner;

public class _p79_Angulo {
    public static float encontarAngulo(float angulo){
        if (angulo < 90) {
            System.out.print(String.format("El Angulo %.2f° es Agudo", angulo));
        }else if (angulo != 90) {
            System.out.print(String.format("El Angulo %.2f° es Recto", angulo));
        }else if ((angulo>90) && (angulo<180)) {
            System.out.print(String.format("El Angulo %.2f° es Obtuso", angulo));
        }else if (angulo != 180) {
            System.out.print(String.format("El Angulo %.2f° es LLano", angulo));
        }else if ((angulo>180) && (angulo<360)) {
            System.out.print(String.format("El Angulo %.2f° es Concavo", angulo));
        }
        return angulo;
    }
    public static void main(String[] args) {
        float angulo;
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa el angulo: ");angulo = obj.nextFloat();

        angulo = 0;

        if ((angulo>0) && (angulo<360)) {
            encontarAngulo(angulo);
            System.out.println("Gracias por usar este programa");
        }
        else{
            System.out.println("El angulo ingresado no es valido");
        }
        obj.close();
    }
}
