package ejercicio5;

public class Surtidor {
	private int capacidadMaxima; // (litros combustible)
	private int litrosDisponibles;

	public Surtidor(int capacidadMaxima, int litrosDisponibles) {
		this.capacidadMaxima = capacidadMaxima;
		this.litrosDisponibles = litrosDisponibles;
	}

	public synchronized int cargarCombustible(int cantNecesaria, String id) {

		int litrosCargados = 0;
		if (litrosDisponibles > 0) {
			if (litrosDisponibles >= cantNecesaria) {
				litrosDisponibles -= cantNecesaria;
				litrosCargados = cantNecesaria;
				System.out.println("Se cargaron (" + cantNecesaria + ") litros a " + id);
				System.out.println("Estado actual del surtidor: " + litrosDisponibles + " litros disponibles.");

			} else {
				litrosCargados = litrosDisponibles;
				litrosDisponibles = 0;
				System.out.println("Se cargaron (" + litrosCargados + ") litros a " + id);
				System.out.println("Estado actual del surtidor: SIN COMBUSTIBLE.");
			}
		}
		return litrosCargados;
	}

}
