package ejercicio1;

public class Pasajero extends Thread {

	private Tren tren;
	private String nombre;

	public Pasajero(Tren tren, String nombre) {
		this.tren = tren;
		this.nombre = nombre;
	}

	@Override
	public void run() {

		while (true) {
			tren.subir(nombre);
			tren.bajar(nombre);
		}
	}
}
