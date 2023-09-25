import java.util.Scanner;

public class PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroA = 0;
        int totalDineroD = 0;
        int totalDineroT = 0;
        int totalDineroG = 0;
        int totalEdades = 0;

        while (true) {
            System.out.println("Ingrese el nombre del participante (o 'Adio' para terminar): ");
            String nombre = scanner.nextLine();
            
            if (nombre.equalsIgnoreCase("Adio")) {
                break;
            }
            
            System.out.println("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.println("Ingrese el sexo de " + nombre + " (H/M): ");
            char sexo = scanner.nextLine().charAt(0);
            
            System.out.println("Ingrese el tipo de participante de " + nombre + " (Alumno/Docente/Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            if (edad >= 18) {
                                totalParticipantes++;
                totalEdades += edad;

                switch (tipoParticipante.toLowerCase()) {
                    case "alumno":
                        totalAlumnos++;
                        totalDineroA += 50;
                        break;
                    case "docente":
                        totalDocentes++;
                        totalDineroD += 80;
                        break;
                    case "trabajador":
                        totalTrabajadores++;
                        totalDineroT += 60;
                        break;
                }

                if (sexo == 'H') {
                    totalHombres++;
                } else if (sexo == 'M') {
                    totalMujeres++;
                }
            } else {
                if (edad < 17){
                    System.out.println("No cumple con la mayoria de edad");
                }
            }
                
            
        }

        totalDineroG = totalDineroA + totalDineroD + totalDineroT;
        double promedioEdad = (double) totalEdades / totalParticipantes;

        System.out.println("\nResumen de inscripciones:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        
        System.out.println("\nResumen de dinero recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroA);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroD);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroT);
        System.out.println("Total dinero en general: " + totalDineroG);
        
        System.out.println("\nMensaje final de despedida:");

        if (totalDineroG < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroG >= 100 && totalDineroG < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
    }
    }
}

 


        
        

    


