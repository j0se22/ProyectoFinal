package Ejercicio7;

public class main {

	public static void main(String[] args) {
		 try {
	            // Crear un equipo
	            Equipo equipo = new Equipo("FC Futbolistas");

	            // Crear futbolistas
	            Futbolista futbolista1 = new Futbolista("Juan", 25, Posicion.PORTERO, 5, 3);
	            Futbolista futbolista2 = new Futbolista("Carlos", 28, Posicion.DEFENSA, 6, 5);
	            Futbolista futbolista3 = new Futbolista("Pedro", 23, Posicion.CENTROCAMPISTA, 4, 2);
	            Futbolista futbolista4 = new Futbolista("David", 26, Posicion.DELANTERO, 7, 6);
	            Futbolista futbolista5 = new Futbolista("Luis", 24, Posicion.PORTERO, 2, 0);
	            
	            // Añadir futbolistas al equipo
	            equipo.agregarFutbolista(futbolista1);
	            equipo.agregarFutbolista(futbolista2);
	            equipo.agregarFutbolista(futbolista3);
	            equipo.agregarFutbolista(futbolista4);
	            equipo.agregarFutbolista(futbolista5);
	            
	            // Intentar agregar más futbolistas en posiciones ya completas
	           //  Futbolista futbolista6 = new Futbolista("Sergio", 30, Posicion.PORTERO, 10, 8);
	           // equipo.agregarFutbolista(futbolista6);  // Esto lanzará una excepción

	            // Listar la formación del equipo
	            System.out.println("\nFormación del equipo:");
	            equipo.listarFormacionDelEquipo();
	        } catch (RegistroFutbolistaException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
