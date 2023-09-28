package ejercicio2;

import java.util.concurrent.Semaphore;

public class Tren {

	private int cantAsientos;
	private int asientosDisponibles;
	private Semaphore controlador;
	private Semaphore subir;
	private Semaphore bajar;

	public Tren(int asientos) {
		this.cantAsientos = asientos;
		this.asientosDisponibles = asientos;
		this.controlador = new Semaphore(1);
		this.subir = new Semaphore(0);
		this.bajar = new Semaphore(0);
	}

	// METODOS CONTROLADOR

	public boolean estaLleno() {
		return asientosDisponibles == 0;
	}

	public void habilitarTren() {
		// habilita el semaforo para que los pasajeros puedan subir al tren

		try {
			controlador.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (asientosDisponibles == cantAsientos) {
			System.out.println("Tren listo para que suban los pasajeross");
			subir.release();
		}
	}

	public void iniciarRecorrido() {
		try {
			controlador.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El tren inicia su recorrido");
	}

	public void terminarRecorrido() {
		System.out.println("Fin del recorrido. Los pasajeros pueden bajar");
		bajar.release();
	}

	// METODOS DE PASAJEROS

	public void subir(String pasajero) {
		try {
			subir.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (asientosDisponibles > 0) {
			asientosDisponibles--;
			System.out.println(pasajero + " ha subido al tren");
		}
		if (asientosDisponibles == 0) {
			System.out.println("Tren lleno");
			controlador.release();
		} else {
			subir.release();
		}
	}

	public void bajar(String pasajero) {

		try {
			bajar.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		asientosDisponibles++;
		System.out.println(pasajero + " ha bajado del tren");
		if (asientosDisponibles == cantAsientos) {
			// si todos los pasajeros abandonaron el tren, se libera el permiso del controlador
			controlador.release();
		} else {
			// todavia quedan pasajeros en el tren
			bajar.release();
		}
	}
}
