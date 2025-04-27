package Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Futbolista> futbolistas;
    private static final int MAX_PORTEROS = 2;
    private static final int MAX_DEFENSAS = 5;
    private static final int MAX_CENTROCAMPISTAS = 5;
    private static final int MAX_DELANTEROS = 4;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.futbolistas = new ArrayList<>();
    }

    // Metodo para agregar futbolista
    public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {
        long count = futbolistas.stream().filter(f -> f.getPosicion() == futbolista.getPosicion()).count();
        
        if (futbolista.getPosicion() == Posicion.PORTERO && count >= MAX_PORTEROS) {
            throw new RegistroFutbolistaException("Número máximo de porteros alcanzado.");
        } else if (futbolista.getPosicion() == Posicion.DEFENSA && count >= MAX_DEFENSAS) {
            throw new RegistroFutbolistaException("Número máximo de defensas alcanzado.");
        } else if (futbolista.getPosicion() == Posicion.CENTROCAMPISTA && count >= MAX_CENTROCAMPISTAS) {
            throw new RegistroFutbolistaException("Número máximo de centrocampistas alcanzado.");
        } else if (futbolista.getPosicion() == Posicion.DELANTERO && count >= MAX_DELANTEROS) {
            throw new RegistroFutbolistaException("Número máximo de delanteros alcanzado.");
        }

        futbolistas.add(futbolista);
    }

    // Metodo para listar la formacion del equipo
    
    public void listarFormacionDelEquipo() {
        Collections.sort(futbolistas, (f1, f2) -> f1.getPosicion().compareTo(f2.getPosicion()));

        Iterator<Futbolista> iterator = futbolistas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    // Getters y Setters
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Futbolista> getFutbolistas() {
		return futbolistas;
	}

	public void setFutbolistas(List<Futbolista> futbolistas) {
		this.futbolistas = futbolistas;
	}

	public static int getMaxPorteros() {
		return MAX_PORTEROS;
	}

	public static int getMaxDefensas() {
		return MAX_DEFENSAS;
	}

	public static int getMaxCentrocampistas() {
		return MAX_CENTROCAMPISTAS;
	}

	public static int getMaxDelanteros() {
		return MAX_DELANTEROS;
	}
    
    
}