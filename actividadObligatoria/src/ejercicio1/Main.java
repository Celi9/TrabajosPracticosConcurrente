package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Tren tren = new Tren(6);
		Thread controlador = new ControlTren(tren);
		Thread[] pasajeros = new Thread[20];

		for (int i = 0; i < pasajeros.length; i++) {
			pasajeros[i] = new Pasajero(tren, "Pasajero" + i);
		}

		controlador.start();

		for (Thread pasajero : pasajeros) {
			pasajero.start();
		}
	}
}
