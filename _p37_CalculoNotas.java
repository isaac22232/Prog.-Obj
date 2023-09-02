// Calcular el promedio de las notas

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float cal1, cal2, cal3, cal4, cal5, promedio;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa las calificaciones: ");
        System.out.print("1er Calificacion: "); cal1 = obj.nextFloat();
        System.out.print("2da Calificacion: "); cal2 = obj.nextFloat();
        System.out.print("3er Calificacion: "); cal3 = obj.nextFloat();
        System.out.print("4ta Calificacion: "); cal4 = obj.nextFloat();
        System.out.print("5ta Calificacion: "); cal5 = obj.nextFloat();

        promedio = (cal1 + cal2 + cal3 + cal4 + cal5)/5;

        if ((promedio > 0) && (promedio <= 6)) {
            System.out.print(String.format("El promedio es: %.2f\nQuedas reprobado", promedio));
        }
        else if ((promedio > 6) && (promedio <=7)) {
            System.out.print(String.format("El promedio es: %.2f\nPasas de panzazo", promedio));
            
        }
        else if ((promedio > 7) && (promedio <=8)) {
            System.out.print(String.format("El promedio es: %.2f\nMuy bien,Puedes mejorar", promedio));
        }
        else if ((promedio > 8) && (promedio <=9)) {
            System.out.print(String.format("El promedio es: %.2f\nExcelente,Sigue así", promedio));
        }
        else if ((promedio > 9) && (promedio <=10)) {
            System.out.print(String.format("El promedio es: %.2f\nPerfecto,Tu esfuerzo valio la pena", promedio));
        }
        obj.close();
    }
}