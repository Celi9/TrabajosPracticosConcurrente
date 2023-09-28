package ejercicio2;

public class Pasajero extends Thread {

	private Tren tren;
	private MaquinaExpendedora maquina;
	private String nombre;

	public Pasajero(Tren tren, MaquinaExpendedora m, String nombre) {
		this.tren = tren;
		this.maquina = m;
		this.nombre = nombre;
	}

	@Override
	public void run() {

		while (true) {
			maquina.comprarTicket(nombre);
			tren.subir(nombre);
			tren.bajar(nombre);
		}
	}
}
