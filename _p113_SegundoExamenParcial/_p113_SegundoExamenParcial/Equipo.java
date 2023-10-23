package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    protected String Nombre;
    protected String Liga;
    protected ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga, ArrayList<Jugador> jugadores) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double totalJugadores = 0;
        for (Jugador jugador : Jugadores) {
            totalJugadores += jugador.getTotal();
        }
        return totalJugadores;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("\nReporte del Equipo: " + Nombre);
        System.out.println("\nLiga: " + Liga);
        System.out.println("\nTotal de Jugadores: " + Jugadores.size());
        System.out.println("\nTotal de Bono: " + getTotalBono());
        System.out.println("\nTotal de Totales: " + getTotal());
        System.out.println("\nTotal de Hombres: " + getTotalH());
        System.out.println("\nTotal de Mujeres: " + getTotalM());
        System.out.println();
        for (Jugador jugador : Jugadores) {
            System.out.println("\t>> " + jugador.toString());
         }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() +
               "\nTotal de Bono: " + getTotalBono() + "\nTotal de Totales: " + getTotal() +
               "\nTotal de Hombres: " + getTotalH() + "\nTotal de Mujeres: " + getTotalM() + "]";
    }

    public void agregarJugador(JugadorActivo jugadorActivo) {
        Jugadores.add(jugadorActivo);
    }

    public void agregarJugador(JugadorEntrenador jugadorEntrenador) {
        Jugadores.add(jugadorEntrenador);
    }
}

