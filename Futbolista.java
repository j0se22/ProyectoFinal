package Ejercicio7;

import java.util.List;

public class Futbolista implements Deportista {
    private String nombre;
    private int edad;
    private Posicion posicion;
    private List<String> equipos;
    private int aniosProfesional;
    private int totalTrofeos;

    public Futbolista(String nombre, int edad, Posicion posicion, int aniosProfesional, int totalTrofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.aniosProfesional = aniosProfesional;
        this.totalTrofeos = totalTrofeos;
        this.equipos = new java.util.ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getAniosProfesional() {
        return aniosProfesional;
    }

    public void setAniosProfesional(int aniosProfesional) {
        this.aniosProfesional = aniosProfesional;
    }

    public int getTotalTrofeos() {
        return totalTrofeos;
    }

    public void setTotalTrofeos(int totalTrofeos) {
        this.totalTrofeos = totalTrofeos;
    }

    public List<String> getListadoEquipos() {
        return equipos;
    }

    public void addEquipo(String equipo) {
        equipos.add(equipo);
    }

    @Override
    public String toString() {
        return "Futbolista: " + nombre + ", Edad: " + edad + ", Posición: " + posicion +
               ", Salario Minimo: " + posicion.getSalarioMinimo() + "€ - " + posicion.getSalarioMaximo() + "€";
    }

}